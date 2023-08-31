package com.tts.spookytime.SpookSaloon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpookSaloonController {
	
	@GetMapping(value = "/")
	public String home() {
	    return "spookytime/home";
	}
	
	@GetMapping(value = "/spookytime/gallery")
	public String gallery() {
	    return "spookytime/gallery";
	}
	
	@GetMapping(value = "/spookytime/systems")
	public String systems() {
	    return "spookytime/systems";
	}
		
}
