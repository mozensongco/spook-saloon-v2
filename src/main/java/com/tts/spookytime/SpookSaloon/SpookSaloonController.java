package com.tts.spookytime.SpookSaloon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpookSaloonController {
	
	@Autowired
	private StaffProfileRepository staffProfileRepo;
		
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
	
    private StaffProfile staffApp;
    
    // Spent way too long struggling with the form display not working before I realized I'd forgotten to pass StaffProfile as an argument here.
    @GetMapping(value = "/spookytime/staffapps")
    public String appForm(StaffProfile staffProfile) {
    	return "spookytime/staffapps";
    }
    
    @PostMapping(value = "/spookytime")
    public String addNewStaffApp(StaffProfile newApp, Model model) {
		staffProfileRepo.save(new StaffProfile(newApp.getName(), newApp.getEmail()));
		model.addAttribute("name", newApp.getName());
		model.addAttribute("email", newApp.getEmail());
	return "spookytime/submitted";
    }


	
}
