package com.srs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class indexController {

	
	@RequestMapping(value="/index")
	public String indexPage(Model model)
	{
		System.out.println("Index Controller");
		return "forward:index.jsp";
	}
	
}
