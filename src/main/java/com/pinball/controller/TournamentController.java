package com.pinball.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinball.resource.Tournament;

@RestController
public class TournamentController {

	    @RequestMapping("/tournament")
	    public Tournament tournament() {
	        return new Tournament(true,"Phil's House", "First Tourn");
	    }
}