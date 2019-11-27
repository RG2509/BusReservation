package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import com.model.Payment;
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
			mav = new ModelAndView("passengerform");
			
			HttpSession session = request.getSession();
			session.setAttribute("email", iuser.getEmail());

		} else {
			mav = new ModelAndView("userlogin");
			mav.addObject("status", "Username or Password is wrong!!");
		}
		return mav;
	}
	
	  @RequestMapping(value = "/userlogout", method = RequestMethod.GET)
			public ModelAndView userlogout(HttpServletRequest request, HttpServletResponse response) {
				 HttpSession session =request.getSession(false);
				 session.invalidate();
				 ModelAndView mav = new ModelAndView("userlogin");
				 mav.addObject("user", new Users());
				
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
			
			int no_of_passengers  =Integer.parseInt(request.getParameter("no_of_passengers").trim());
			
			//store booking required info in 
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
		String Booking_id="B"+(long)new Date().getTime();
		 
		 System.out.println("dtbooking:"+dtbooking);
		 
		 
		Bookings bookings = new Bookings();
		bookings.setStatus("confirmed");
		Bus b = new Bus();
		b.setBus_id(busid);
		bookings.setBus(b);
		
		bookings.setDrop_loc(dest);
		bookings.setPick_loc(src);
		bookings.setDt_of_booking(dtbooking);
		bookings.setNo_of_passengers(no_of_passengers);
		bookings.setTotal_fare(no_of_passengers*fare);
		bookings.setBooking_id(Booking_id);
		
		
		Users users = new Users();
		String email=(String)session.getAttribute("email");
		users.setEmail(email);
		
		System.out.println("busid:"+busid);
		bookings.setUser(users);
		
		session.setAttribute("bookings", bookings);
		
		ModelAndView mav = new ModelAndView("userlogin");
		
		mav.addObject("booking",bookings);
		return mav;
		 
		 
	 }
	 
	 @RequestMapping(value = "/booking3", method = RequestMethod.POST)
		public ModelAndView booking3(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws ParseException {
			
			
		
		  String pname=request.getParameter("p_name"); 
		  String phone = request.getParameter("mobile_no"); 
		  String gender =  request.getParameter("gender");
		  
		  Passenger passenger = new Passenger();
		  passenger.setP_name(pname);
		  passenger.setMobile_no(phone);
		  passenger.setGender(gender);
		  passenger.setP_id(new Date().getTime());
		  
		  
		  Bookings bookings =(Bookings)session.getAttribute("bookings");
		  bookings.getPassengers().add(passenger);
		  passenger.setBookings(bookings);
		 
		  
		  session.setAttribute("booking", bookings);
		  
		  System.out.println("success");
		  ModelAndView mav = new ModelAndView("makepayment");
		  mav.addObject("booking",bookings);
          return mav;
		 
			
	 }
	 
	 @RequestMapping(value = "/booking4", method = RequestMethod.POST)
		public ModelAndView makepayment(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws ParseException {
	    
		 // read payment info and then persist :  booking , passenger , payment
		 
				 String card_type = request.getParameter("card_type");
			 System.out.println("card type"+card_type);
			String card_number=(request.getParameter("card_number"));
			 System.out.println("card number:"+card_number);

		
			 String name = request.getParameter("name");
			 System.out.println(name);
			
			 
			 Bookings bookings =(Bookings)session.getAttribute("booking");
			 
			 Payment payment = new Payment();
			 payment.setPayment_id(new Date().getTime());
			 payment.setCard_number(card_number);
			 payment.setCard_type(card_type);
			 payment.setName(name);
	         payment.setBookings(bookings);
		     bookings.setPayment(payment);
			 
			
		  
		     Bookings nBookings=userservice.makePayment(bookings);
			System.out.println("flag1="+nBookings);
		 
		   ModelAndView mav = new ModelAndView("mybill");
		   mav.addObject("booking",nBookings);
		   return mav;
			
			
	 }
	
	
	 
	 @RequestMapping(value = "/cancel_booking", method = RequestMethod.GET)
	 public ModelAndView cancelBooking(HttpServletRequest request, HttpServletResponse response){
		 
	 	 ModelAndView mav = new ModelAndView("cancel_booking");
	 	 mav.addObject("bookings",new Bookings());
	 	 return mav;
	  } 
	 
	 @RequestMapping(value = "/cancel_booking", method = RequestMethod.POST)
		public ModelAndView deleteTicket(HttpServletRequest request,HttpServletResponse response, @ModelAttribute Bookings book)
	 {
		 String booking_id = request.getParameter("booking_id");
		 String email = request.getParameter("email");
		 System.out.println(booking_id+" "+email);
		 boolean flag=userservice.cancelBooking(booking_id,email);
			
			ModelAndView mav = new ModelAndView("success");
			mav.addObject("flag",flag);
			return mav;
		} 
}