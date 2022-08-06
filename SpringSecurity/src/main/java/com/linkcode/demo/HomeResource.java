package com.linkcode.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	  @GetMapping("/")  //should be accessible to everybody -> no authentication
	    public String home() {
	        return ("<h1>Welcome</h1>");
	    }
	  
	  @GetMapping("/user") //accessible by USER and ADMIN
	    public String user() {
	        return ("<h1>Welcome User</h1>");
	    }

	    @GetMapping("/admin")  //only ADMIN allowed
	    public String admin() {
	        return ("<h1>Welcome Admin</h1>");
	    }

}
