package com.pinball.service;

import java.util.ArrayList;
import java.util.List;

import com.pinball.resource.Tournament;

public class TournamentService {

	public List<Tournament> retrieveAllTournaments(){
		final List<Tournament> tournaments = new ArrayList<Tournament>();

		tournaments.add(new Tournament("All of Phil's Tournament", "All The Tournaments", new Long(1),true));

		return tournaments;
	}

	public Tournament getTournamentById(final Long id){

		//Go to the data source and get the desired tournaments information.

   	 return new Tournament("Phil's House", "First Tourn",id,true);

	}

	public boolean deletTournamentById(final Long id){

		/* Go to the data store and delete the tournament.
		 * upon a successful delete, we should receive a true result.
		 * Otherwise if there was any issues we should receive an false.
		 */

		return true;
	}

	/**
	 * This method will create a new {@link Tournament} entry in the data store,
	 * and store the data provided by the user.
	 *
	 * @param tournament A new set of {@link Tournament} data to be stored in the data store.
	 * @return A unique identifier which can be used to access the new set of data created
	 * 		   in the data store.
	 */

	public Long createTournament(final Tournament tournament){
		/*
		 * Go down to the data store and create a new tournament.
		 * Once the tournament information has been stored, we should
		 * return back the id of the newly created tournament (might actually
		 * want to return the entire tournament object).
		 */

		return new Long (16);
	}


	/**
	 * This method will update a given tournaments information, with the new
	 * tournament information provided by the user.
	 *
	 * We should not update the id of the tournament in the data store, even through
	 * a user could provide a new id in the update information. Instead we should update
	 * all other fields of the tournament whose id corresponds to the one in the URI path.
	 *
	 * @param	id 	A unique identifier to a single tournaments information in the data store.
	 * @param	tournamentUpdateInformation The new information the data store should be update with.
	 * @return	The {@link Tournament} object found by the unique id provided in the URI
	 * 			with all data now updated.
	 */
	public Tournament updateTournament(final Long id, final Tournament tournamentUpdateInformation){

		final Tournament updatedTournament = new Tournament();

		updatedTournament.setId(id);
		updatedTournament.setActive(tournamentUpdateInformation.isActive());
		updatedTournament.setLocation(tournamentUpdateInformation.getLocation());
		updatedTournament.setTitle(tournamentUpdateInformation.getTitle());


    	return updatedTournament;

	}
}
