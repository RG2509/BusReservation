package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
	 @RequestMapping(value = "/contact-us", method = RequestMethod.GET)
	  public ModelAndView showcontact(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("contact-us");
	    mav.addObject("user", new Users());
	    return mav;
	  
	  }	  
	  @RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	  public ModelAndView showabout(HttpServletRequest request, HttpServletResponse response) 
  {
	    ModelAndView mav = new ModelAndView("aboutus");
	    mav.addObject("user", new Users());
	    return mav;
	    
	    

    
  }
	
	//booking
	
	
	 @RequestMapping(value = "/booking1", method = RequestMethod.GET)
	 public ModelAndView busbooking(){
		 
	 	 ModelAndView mav = new ModelAndView("busbooking");
	 	 return mav;
	  }
	 
	 @RequestMapping(value = "/booking1", method = RequestMethod.POST)
		public ModelAndView booking1(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws ParseException {
		 String source = request.getParameter("source");
			String destination = request.getParameter("destination");
			
			SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
		    String dt_of_booking1 = request.getParameter("dt_of_booking").trim();
		  	 Date dt_of_booking =formatter1.parse(dt_of_booking1);
			 System.out.println("dtbooking:"+dt_of_booking);
			//no_of_passengers
			int no_of_passengers  =Integer.parseInt(request.getParameter("no_of_passengers").trim());
			
			//store booking erquired info in 
			session.setAttribute("source", source);
			session.setAttribute("destination", destination);
			session.setAttribute("dtbooking", dt_of_booking);
			session.setAttribute("no_of_passengers", no_of_passengers);
			
			
			List<Bus> blist = userservice.busbooking(source, destination, dt_of_booking, no_of_passengers);
			System.out.println("blist:"+blist.size());
			ModelAndView mav = new ModelAndView("busbooking");
			mav.addObject("bus_list",blist);
			return mav;
	 } 
	 
	 @RequestMapping(value = "/booking2", method = RequestMethod.POST)
		public ModelAndView booking2(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws ParseException {
		 
		 String busid = request.getParameter("busid");
		 int fare =Integer.parseInt(request.getParameter("fare"));

		 String src =(String)session.getAttribute("source");
		 String dest =(String)session.getAttribute("destination");
		 Date dtbooking =(Date)session.getAttribute("dtbooking");
		 int no_of_passengers =(Integer)session.getAttribute("no_of_passengers");
		 
		Bookings bookings = new Bookings();
		Bus b = new Bus(); b.setBus_id(busid);
		bookings.setBus(b);
		bookings.setDrop_loc(dest);
		bookings.setPick_loc(src);
		bookings.setDt_of_booking(dtbooking);
		bookings.setNo_of_passengers(no_of_passengers);
		bookings.setTotal_fare(no_of_passengers*fare);
		
		session.setAttribute("bookings", bookings);
		
		ModelAndView mav = new ModelAndView("passengerform");
		mav.addObject("booking",bookings);
		return mav;
		 
		 
	 }
	 
	 @RequestMapping(value = "/booking3", method = RequestMethod.POST)
		public ModelAndView booking3(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws ParseException {
	
		 String pname=request.getParameter("pname");
		 String phone = request.getParameter("phone");
		 String gender = request.getParameter("gender");
		 
		 Passenger passenger = new Passenger();
		 passenger.setGender(gender);
		 passenger.setMobile_no(phone);
		 passenger.setP_name(pname);
		 
		 Bookings bookings =(Bookings)session.getAttribute("bookings");
		 
		 ModelAndView mav = new ModelAndView("passengerform");
			mav.addObject("booking",bookings);
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
 * mav = new ModelAndView("success"); mav.addObject("book", bookings);
 *  return
 * mav;
 * 
 * 
 * } }
 * 
 * 
 */