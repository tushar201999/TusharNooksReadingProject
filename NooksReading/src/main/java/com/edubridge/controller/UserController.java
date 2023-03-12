package com.edubridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubridge.main.UserDetailsMain;
import com.edubridge.model.Userdetails;



@Controller
public class UserController 
{
	@RequestMapping("/")
	public String m1()
	{
		return "index";
	}
	
	@RequestMapping("/users/login")
	public String m2()
	{
		return "login";
	}
	
	@RequestMapping("/users/register")
	public String m3(ModelMap map)
	{
		map.addAttribute("usersdata",new Userdetails());
		return "register";
	}
	@RequestMapping("/users/add")
	public String m4(@ModelAttribute("usersdata") Userdetails ud)
	{
		UserDetailsMain um=new UserDetailsMain();
		ud.setStatus("InActive");
		um.addUsersDetails(ud);
		
		return "login";
	}
	
}

