package com.srs.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.srs.Model.User_login;

@Controller
@SessionAttributes("login_form")
public class signinController {

	
	@RequestMapping(value="/signin" , method= RequestMethod.GET)
	public String getLoginPage(Model model)
	{
		System.out.println("Sign in Controller GET");
		//User_login user = new User_login();
		
		model.addAttribute("login_form", new User_login());
		
		//System.out.println(	user.getuser_name());
		return "signin";
	}
	
	@RequestMapping(value="/signin", method= RequestMethod.POST)
	public String userLogin(@ModelAttribute ("login_form") User_login user )
	{
		System.out.println("Sign in Controller POST");
		user.userLoginValedation(user.getUser_name(),user.getPassword());
		//List results=user.getResults();
		//System.out.println(results.toString());
		if(user.getResults().isEmpty())
		{
			return "redirect:403.html";
		}
		else
		{
			//return "signin";
			return "redirect:mainmenu.html";
		}
			
	}
	@RequestMapping(value="/403", method= RequestMethod.GET)
	public String accessDeined(Model model )
	{
		System.out.println("403 ERROR ");
		 model.addAttribute("Error", "You do not have permission to access this page!");
		 return ("403Page");
	}
			
}
