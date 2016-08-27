package com.srs.Controller;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.srs.Model.LoginService;

@Controller
@SessionAttributes("login_form")
public class signinController {

	
	@RequestMapping(value="/signin" , method= RequestMethod.GET)
	public String getLoginPage(Model model)
	{
		System.out.println("Sign in Controller GET");
		//User_login user = new User_login();
		
		model.addAttribute("login_form", new LoginService());
		
		//System.out.println(	user.getuser_name());
		return "signin";
	}
	
	@RequestMapping(value="/signin", method= RequestMethod.POST)
	public String userLogin(@ModelAttribute ("login_form") LoginService userLogin )
	{
		System.out.println("Sign in Controller POST");
		userLogin.userLoginValedation(userLogin.getUser_name(),userLogin.getPassword());
		//List results=user.getResults();
		//System.out.println(results.toString());
		if(userLogin.getResults().isEmpty())
		{
			return "redirect:403.html";
		}
		else
		{
			//return "signin";
			return "redirect:mainmenu.html";
		}
			
	}
	
			
}
