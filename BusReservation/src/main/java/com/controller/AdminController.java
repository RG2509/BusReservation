package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Admin;
import com.model.Bus;
import com.model.Route;
import com.model.Users;
import com.service.AdminServiceIntf;

@Controller("admincontroller")

public class AdminController {
	
	@Autowired
	private AdminServiceIntf adminservice;
	

	
	
	  @RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("adminlogin");
	   mav.addObject("admin", new Admin());
	    return mav;
	  }

	
	  @RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	  public  ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse
	  response, @ModelAttribute Admin adm)
	  { 
		  ModelAndView mav = null;
		 
		Admin admin = adminservice.validateAdmin(adm);
		if (admin != null) {
		      mav = new ModelAndView("welcome");
		      mav.addObject("email_id",adm.getEmail_id());
		      //session manage
		      HttpSession session= request.getSession();
		      session.setAttribute("password",adm.getPassword());
		    } else {
		      mav = new ModelAndView("adminlogin");
		      mav.addObject("message", "Username or Password is wrong!!");
		    }
		    return mav;
		  }
	
	
	  @RequestMapping(value = "/logout", method = RequestMethod.GET)
		public ModelAndView userlogout(HttpServletRequest request, HttpServletResponse response) {
			 HttpSession session =request.getSession(false);
			 session.invalidate();
			 ModelAndView mav = new ModelAndView("adminlogin");
			 mav.addObject("admin", new Admin());
			 return mav;
		 }
	  
	  
	  
	  //add bus
	  
	  @RequestMapping(value = "/addbus", method = RequestMethod.GET)
	  public ModelAndView showRegister2(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("addbus");
	    mav.addObject("bus", new Bus());
	    return mav;
	  }
	 
	  @RequestMapping(value = "/addbus", method = RequestMethod.POST)
	  public ModelAndView addUser2(  @ModelAttribute("bus") Bus bus , @RequestParam String route_id) {
		/*
		 * String id = bus.getBus_id(); String name =bus.getBus_name(); String
		 * bus_no=bus.getBus_no(); String bus_type=bus.getBus_type(); int
		 * seats=bus.getNo_of_seats(); int fare=bus.getFare(); String
		 * departure_time=bus.getDeparture_time(); String
		 * arrival_time=bus.getArrival_time();
		 */
		System.out.println(route_id);
		
		Route route=new Route();
		route.setRoute_id(route_id);
		
		
	    bus.setRoute(route);
		
		boolean flag=adminservice.addBus(bus);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("addbus");
	    mav.addObject("status","already exist");
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("adminlogin");
	        mav.addObject("bus", new Bus());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	  
	  
	  //view bus
	  
	  @RequestMapping(value = "/aviewbus", method = RequestMethod.GET)
		public ModelAndView viewbus(HttpServletRequest request, HttpServletResponse response) {
			List<Bus>  buslist = adminservice.getBus();
			 ModelAndView mav = new ModelAndView("aviewbus");
			 mav.addObject("buslist", buslist);
			 HttpSession session =request.getSession(false);
			 session.setAttribute("blist", buslist);
			 return mav;
		 }
	  
	  
	  
	  //add route
	  
	  @RequestMapping(value = "/addroute", method = RequestMethod.GET)
	  public ModelAndView showRoute(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("addroute");
	    mav.addObject("route", new Route());
	    return mav;
	  }
	 
	  @RequestMapping(value = "/addroute", method = RequestMethod.POST)
	  public ModelAndView addRoute(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("route") Route route) {
		/*
		 * String route_id = route.getRoute_id(); String source = route.getSource();
		 * String destination = route.getDestination(); String distance =
		 * route.getDistance();
		 */
		  
		boolean flag=adminservice.addRoute(route);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("addroute");
	    mav.addObject("status","already exist");
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("addroute");
	        mav.addObject("route", new Route());
	        mav.addObject("status","Sorry! ");
	        return mav;	
	    }
	  }
	  
	  
	  //source destination
	  
	
	  @RequestMapping(value = "/searchbus", method = RequestMethod.GET) 
	  public ModelAndView searchbus()
	  {
		  
		  ModelAndView mav = new ModelAndView("search");
		  return mav;
	  }
	 
	  @RequestMapping(value = "/searchbus", method = RequestMethod.POST) 
	  public ModelAndView showbus1(HttpServletRequest request, HttpServletResponse response)
	  {
		  String destination = request.getParameter("destination");
		  String source = request.getParameter("source");
		  
		  List<Bus> list = adminservice.showBus(source,destination);
		  ModelAndView mav = new ModelAndView("search");
		  mav.addObject("buslist", list);
		  return mav;
	  }
	  
	 
	
}
