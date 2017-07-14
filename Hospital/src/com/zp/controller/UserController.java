package com.zp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zp.entity.User;
import com.zp.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService=null;
	
	@RequestMapping(value="/login")
	public String Login(User user,HttpServletRequest request){
		User user2=userService.Login(user);
		if(user2!=null){
			request.getSession().setAttribute("userlogin", user2);
		}
		return "allHospital";
	}
	@RequestMapping(value="/loginOut")
	public String LoginOut(HttpServletRequest request){
		request.getSession().removeAttribute("userlogin");
		return "allHospital";
	}
}
