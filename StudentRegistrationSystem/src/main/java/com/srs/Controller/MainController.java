package com.srs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	
	
	@RequestMapping (value="/mainmenu")
	public String getMainMenu(Model model)
	{
		
		System.out.println("Main Controller");
		return "main";
	}
}
