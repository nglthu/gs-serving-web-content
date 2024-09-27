package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/Login")
	

    public String login(@RequestParam(name="fname", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
	
		return "hello";
	}

}
