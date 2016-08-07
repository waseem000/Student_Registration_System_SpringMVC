package com.srs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class signinController {

	
	@RequestMapping(value="/signin")
	public String getLoginPage(Model model)
	{
		System.out.println("Sign in Controller");
		return "signin";
	}
}
