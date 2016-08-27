package com.srs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.srs.Model.User;

@Controller
@SessionAttributes("success")
public class MainController {

	
	
	
	@RequestMapping (value="/mainmenu", method= RequestMethod.GET)
	public String getMainMenu(Model model)
	{
		//User user =new User();
		//user.getUserData(2);
		//model.addAttribute("createuser",new User());
		//user.createUser(roleId, regId, firstName, lastName, userName, password, email)
		System.out.println("GET Main Controller");
		return "main";
	}

	@RequestMapping (value="/adduser", method = RequestMethod.GET)
	public String getAddUserPage(@ModelAttribute ("createuser") User user, Model model)
	{
		//User user =new User();
				//user.getUserData(2);
				model.addAttribute("createuser",new User());
				//user.createUser(roleId, regId, firstName, lastName, userName, password, email)
				System.out.println("GET Add User Page Controller");
				return "adduser";
	}
	@RequestMapping (value="/adduser", method = RequestMethod.POST)
	public String createUser(@ModelAttribute ("createuser") User user, Model model)
	{
		String success;
		System.out.println("POST Add User Page  Controller");
		success=user.createUser();
		if(!success.equals("true"))
		{
			//Model model = null;
			System.out.println("POST Add User Page Error Controller");
			model.addAttribute("Error", "User has not been Created ");
			return "redirect:403.html";
		}
		else if(success.equals("true")&&user.getRegId()==0)
		{
			System.out.println("POST Add User Page Success Controller");
			model.addAttribute("Success", "User has  been Created going to create Staff");
			return "redirect:mainmenu.html";
		}
		else if(success.equals("true")&&user.getRegId()==0)
		{
			System.out.println("POST Add User Page Success Controller");
			model.addAttribute("Success", "User has  been Created going to Create Studnet");
			return "addstudent.html";
		}
		else
		{
			System.out.println("POST Add User Page Error Controller");
			model.addAttribute("Error", "Error last eles ");
			return "redirect:403.html";
		}
	}
	@RequestMapping (value="/mainmenu/Updateuser", method= RequestMethod.GET)
	public String getUpdateUser(Model model)
	{
		User user =new User();
		user.getUserData(2);
		model.addAttribute("updateuser",user);
		//user.createUser(roleId, regId, firstName, lastName, userName, password, email)
		System.out.println("GET Upadte Main Controller");
		return "main";
	}
	
	@RequestMapping (value="/mainmenu/Updateuser", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute ("updateuser") User user, Model model)
	{
		String success;
		success=user.createUser();
		if(success.equals("true"))
		{
			//Model model = null;
			model.addAttribute("Error", "User has been Created ");
		}
		System.out.println("POST Main Controller");
		return "main";
	}
}
