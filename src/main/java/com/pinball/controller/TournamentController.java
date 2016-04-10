package com.pinball.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pinball.resource.Tournament;
import com.pinball.service.TournamentService;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

		/* Doing it this way right now, to use as an example as to why dependency
		 * injection is nice.
		 */
		TournamentService tournamentService = new TournamentService();

		//TODO: We will want to paginate this method at some point.
		@RequestMapping(value="/all", method = RequestMethod.GET)
		public List<Tournament> getAllTournaments(){

			final List<Tournament> tournaments = tournamentService.retrieveAllTournaments();

			return tournaments;
		}

	    @RequestMapping(value="/id/{id}", method = RequestMethod.GET)
	    public ResponseEntity<Tournament> getTournament(@PathVariable final Long id) {

	    	final Tournament result = tournamentService.getTournamentById(id);

	        if(result == null)
	        {
	        	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	        }

	        return ResponseEntity.ok(result);
	    }

	    @RequestMapping(value="/id/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity deleteTournament(@PathVariable final Long id){

	    	if(tournamentService.deletTournamentById(id)){
	    		return ResponseEntity.status(204).body(null);
	    	}

	    	return ResponseEntity.status(500).body(null);

	    }

	    @RequestMapping(value="/id/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<Tournament> updateTournament(@PathVariable final Long id,
	    		@RequestBody final Tournament tournament){

	    	final Tournament result = tournamentService.updateTournament(id, tournament);

	    	return ResponseEntity.ok().body(result);
	    }

	    @RequestMapping(value="/new", method = RequestMethod.POST)
	    public ResponseEntity<Long> createTournament(@RequestBody final Tournament tournament){

	    	final Long result = tournamentService.createTournament(tournament);

	    	return ResponseEntity.ok(result);
	    }
}