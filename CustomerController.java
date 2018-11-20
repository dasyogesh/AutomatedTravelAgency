package com.ey.ata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ey.ata.bean.CredentialsBean;
import com.ey.ata.bean.ProfileBean;
import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.VehicleBean;
import com.ey.ata.service.CustomerService;
//import com.ey.ata.service.CustomerService;
import com.ey.ata.util.Authentication;
import com.ey.ata.util.AuthenticationImpl;
import com.ey.ata.util.User;
import com.ey.ata.util.UserImpl;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

	 @Autowired
	 private User u;
	 @Autowired
	private Authentication auth;
	 @Autowired
	 private CustomerService custservice;
	 
	 @RequestMapping(value="/Register")
     public ModelAndView meth1() {
   	  return new ModelAndView("register");
     }
	 @RequestMapping(value="/registerUser",method=RequestMethod.POST)
	      public ModelAndView meth2(@ModelAttribute("cb")CredentialsBean cb) {
		System.out.println(u.register(cb));
		 return new ModelAndView("profile");
	      }
	 @RequestMapping(value="/registerProfile",method=RequestMethod.POST)
	 public ModelAndView meth3(@ModelAttribute("pb")ProfileBean pb) {
		 System.out.println(u.register1(pb));
			 return new ModelAndView("login");
		      }
	 
	 @RequestMapping(value="/Login")
     public ModelAndView meth4() {
   	  return new ModelAndView("login");
     }
	 @RequestMapping(value="/loginuser")
	 public ModelAndView meth5(@RequestParam("userid")String uid,@RequestParam("pass")String pwd) {
	    	  // System.out.println(uid+" "+pwd);
	    	   //System.out.println(auth);
	    	  // auth.changeLoginStatus(cb, LOGINSTATUS);
	    	  if(auth.Authenticate1(uid, pwd)) {
	    	  
	    	  return new ModelAndView("third");
	    	  }
	    	  return new ModelAndView("second");

     }
	 @RequestMapping(value="/viewVt")
	 public ModelAndView meth5()
	 {
		 return new ModelAndView("vehicletype");
	 }
	 @RequestMapping(value="/vtype")
	 public ModelAndView meth6(@RequestParam("TYPE")String vt)
	 {
		 List al=new ArrayList();
		  al=custservice.viewVehiclesByType(vt);
		 return new ModelAndView("vehicless","vbb",al);
		 
	 }
	 @RequestMapping(value="/viewVs")
	 public ModelAndView meth7()
	 {
		 return new ModelAndView("vehicleseats");
	 }
	 @RequestMapping(value="/vseats")
	 public ModelAndView meth8(@RequestParam("SEATINGCAPACITY")int vs)
	 {
		 List al=new ArrayList();
		  al=custservice.viewVehicleBySeats(vs);
		 return new ModelAndView("vehicless","vbb",al);
		 
	 }
	 @RequestMapping(value="/viewAr")
	 public ModelAndView meth9()
	 {
		 List al=new ArrayList();
		 al=custservice.viewAllRoutes();
		 return new ModelAndView("routess","vbb",al);
	 }
	 @RequestMapping(value="/bookV")
	 public ModelAndView meth10()
	 {
		 return new ModelAndView("newbook");
	 }
	 @RequestMapping(value="/addbook",method=RequestMethod.POST)
	 public ModelAndView meth11(@ModelAttribute("rb")ReservationBean rb) {
		 System.out.println(custservice.bookVehicle(rb));
			
			 return new ModelAndView("success");
		      }
	 @RequestMapping(value="/cancelB")
	 public ModelAndView meth12()
	 {
		 return new ModelAndView("cancel");
	 }
	 @RequestMapping(value="/removebooking")
	 public ModelAndView meth13(@RequestParam("RESERVATIONID")String id)
	 {
		 custservice.cancelBooking(AuthenticationImpl.x, id);
		 return new ModelAndView("success");
	 }
	 @RequestMapping(value="/viewBd")
	 public ModelAndView meth14()
	 {
		 return new ModelAndView("bookings");
	 }
	 @RequestMapping(value="/allB")
	 public ModelAndView meth15(@RequestParam("RESERVATIONID")String id)
	 {
		 return new ModelAndView("details","vbb",custservice.viewBookingDetails(id));
	 }
}
