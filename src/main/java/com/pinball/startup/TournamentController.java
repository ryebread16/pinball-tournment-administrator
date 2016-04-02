package com.pinball.startup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TournamentController {

	    @RequestMapping("/tournament")
	    public Tournament tournament() {
	        return new Tournament(true,"Phil's House", "First Tourn");
	    }
}