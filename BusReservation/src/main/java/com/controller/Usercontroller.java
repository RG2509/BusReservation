package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.model.Bookings;
import com.model.Bus;
import com.model.Passenger;
import com.model.Users;
import com.service.AdminServiceIntf;
import com.service.UserServiceIntf;

@Controller("usercontroller")
public class Usercontroller {

	@Autowired
	private UserServiceIntf userservice;

	@RequestMapping(value = "/userregister", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		// public ModelAndView showRegister() {
		ModelAndView mav = new ModelAndView("userregistration");
		mav.addObject("user", new Users());
		return mav;
	}

	@RequestMapping(value = "/userregister", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") Users user) {

		boolean flag = userservice.registerPassenger(user);
		if (flag) {
			ModelAndView mav = new ModelAndView("userregistration");
			mav.addObject("status", "Your Registration is successfully done.....");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("userregistration");
			mav.addObject("user", new Users());
			mav.addObject("status", "Sorry! Registration in incomplete.....");
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
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute Users iuser) {
		ModelAndView mav = null;
		Users user = userservice.validateUser(iuser);
		System.out.println("user=" + user);
		if (user != null) {
			mav = new ModelAndView("success");
			// mav.addObject("password",iuser.getPassword());
			// session manage
			HttpSession session = request.getSession();
			session.setAttribute("email", iuser.getEmail());

		} else {
			mav = new ModelAndView("userlogin");
			mav.addObject("status", "Username or Password is wrong!!");
		}
		return mav;
	}
	
	//booking
	
	 @RequestMapping(value = "/booking", method = RequestMethod.GET)
	 public ModelAndView busBooking(){
		 
	 	 ModelAndView mav = new ModelAndView("busbooking");
	 	 return mav;
	  }
	 
	 @RequestMapping(value = "/booking", method = RequestMethod.POST)
		public ModelAndView busBooking1(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		 String source = request.getParameter("source");
			String destination = request.getParameter("destination");
			
			 String date_of_journey = request.getParameter("date_of_journey");
		
			String no_of_passengers =request.getParameter("passengers").trim();
			List<Bus> blist = userservice.busBooking(source, destination, date_of_journey, no_of_passengers);
			
		/*
		 * private String ticket_id; private String no_of_passengers; private String
		 * time_of_journey; private String date_of_journey; private String bus_id;
		 * private String p_id;
		 */
			
			ModelAndView mav = new ModelAndView("search");
			mav.addObject("search",blist);
			return mav;
		}  
}

	// cancel ticket
/*
 * @RequestMapping(value = "/deleteTicket", method = RequestMethod.GET) public
 * ModelAndView cancelTicket(HttpServletRequest request, HttpServletResponse
 * response) {
 * 
 * ModelAndView mav = new ModelAndView("deleteTicket");
 * mav.addObject("bookings", new Users()); return mav; }
 * 
 * 
 * 
 * @RequestMapping(value="/deleteTicket", method=RequestMethod.POST) public
 * ModelAndView deleteTicket(HttpServletRequest request ,HttpServletResponse
 * response, @ModelAttribute Bookings book) {
 * 
 * String ticket_id = request.getParameter("ticket_id"); String p_id =
 * request.getParameter("p_id");
 * 
 * 
 * boolean bookings = userservice.deleteTicket(ticket_id, p_id); ModelAndView
 * mav = new ModelAndView("success"); mav.addObject("book", bookings); return
 * mav;
 * 
 * 
 * } }
 * 
 * 
 */