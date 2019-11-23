package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Admin;
import com.model.Bus;
import com.model.Users;
import com.service.AdminServiceIntf;
import com.service.UserServiceIntf;


@Controller("usercontroller")
public class Usercontroller {


	@Autowired
	private UserServiceIntf userservice;
	  
	
	@RequestMapping(value="/userregister" ,method=RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		//public ModelAndView showRegister() {
	    ModelAndView mav = new ModelAndView("userregistration");
	    mav.addObject("user", new Users());
	    return mav;
	  }
	
	@RequestMapping(value="/userregister" ,method=RequestMethod.POST)
	 public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("user") Users user)	
	{
		
		
		
		boolean flag=userservice.registerPassenger(user);
		 if(flag) {
			    ModelAndView mav = new ModelAndView("userregistration");
			    mav.addObject("status","Your Registration is successfully done.....");
			    return mav;
			    }
			    else {
			    	ModelAndView mav = new ModelAndView("userregistration");
			        mav.addObject("user", new Users());
			        mav.addObject("status","Sorry! Registration in incomplete.....");
			        return mav;	
			    }
		 }
		
		
	
	
	 @RequestMapping(value = "/userlogin", method = RequestMethod.GET)
	  public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("userlogin");
	    mav.addObject("user", new Users());
	    return mav;
	  }

	  @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,   @ModelAttribute Users iuser) 
	  {
	    ModelAndView mav = null;
	    Users user = userservice.validateUser(iuser);
	    System.out.println("user="+user);
	    if (user != null) {
	      mav = new ModelAndView("success");
	     // mav.addObject("password",iuser.getPassword());
	      //session manage
	      HttpSession session= request.getSession();
	      session.setAttribute("email", iuser.getEmail());
	    
	    } else {
	      mav = new ModelAndView("userlogin");
	      mav.addObject("status", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	
}
