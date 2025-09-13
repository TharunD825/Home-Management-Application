package com.uniq.HotelManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
    public String index() {
        return "index"; 
    }
	
	 @GetMapping("/register")
	    public String register() {
	        return "register"; 
	    }
	 
	 @GetMapping("/booking")
	    public String booking() {
	        return "booking"; 
	    }
	 
	 @GetMapping("/login")
	    public String login() {
	        return "login"; 
	    }
	 
	 @GetMapping("/home")
	    public String home() {
	        return "home"; 
	    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; 
    }

    @GetMapping("/room")
    public String room() {
        return "room"; 
    }
    
    @GetMapping("/blog")
    public String blog() {
        return "blog"; 
    }

    @GetMapping("/about")
    public String about() {
        return "about"; 
    }
}
