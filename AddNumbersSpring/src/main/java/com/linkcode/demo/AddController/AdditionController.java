package com.linkcode.demo.AddController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.linkcode.demo.domain.Addition;

@Controller
public class AdditionController {

	//@GetMapping is mapping HTTP GET "/index" request onto specific handler method i.e viewForm
	@GetMapping("/index")
	public String viewForm(Model model)
	{
		//model.addAttribute("Addition",new Addition()); //"Addition" is name
		
		return "index";    //name of html page
		
	}
	
	//@PostMapping maps HTTP POST "/addition" request onto specific handler method i.e addForm
	//POST in HTTP is designed to send data to the server  from an HTTP client
	@PostMapping("/addition")
	public String addForm( Addition addition1,Model model) //BindingResult result, @ModelAttribute
	{
		model.addAttribute("xyz",addition1);
		
		return "calculate";
	}
}


