package com.ey.ata.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ey.ata.bean.DriverBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;
import com.ey.ata.service.AdministratorService;
import com.ey.ata.util.Authentication;
import com.ey.ata.util.AuthenticationImpl;

@Controller
@RequestMapping("/Admin")
public class AdminController {
     @Autowired
     private Authentication auth;
     @Autowired
     private SessionFactory sessionFactory;
      @Autowired
      private AdministratorService adminservice;
      @RequestMapping(value="/Login")
      public ModelAndView meth()
      {
    	  return new ModelAndView("adminlogin");
      }
      
      @RequestMapping(value="/login1")
      public ModelAndView meth1(@RequestParam("userid")String uid,@RequestParam("pass")String pwd) {
    	 System.out.println("under controller");
    	 if(auth.Authenticate(uid, pwd)==true) {
    	  return new ModelAndView("fourth");
    	 }
    	 return new ModelAndView("second");
      }
      @RequestMapping(value="/addVehicle")
      public ModelAndView meth2()
      {
    	  return new ModelAndView("addvehicle");
      }
      @RequestMapping(value="/newvehicle")
      public ModelAndView meth3(@ModelAttribute("vb")VehicleBean vb)
      {
    	  System.out.println(adminservice.addVehicle(vb));
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/deleteVehicle")
      public ModelAndView meth4()
      {
    	  return new ModelAndView("deletevehicle");
      }
      @RequestMapping(value="/removevehicle")
      public ModelAndView meth5(@RequestParam("VEHICLEID")String vid)
      {
    	  System.out.println(adminservice.deleteVehicle(vid));
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/viewVehicle")
      public ModelAndView meth6()
      {
    	  return new ModelAndView("viewvehicle");
      }
      @RequestMapping(value="/showvehicle")
      public ModelAndView meth7(@RequestParam("VEHICLEID")String vid)
      {
    	  return new ModelAndView("vehicles","vbb",adminservice.viewVehicle(vid));
      }
      @RequestMapping(value="/modifyVehicle")
      public ModelAndView meth8()
      {
    	  return new ModelAndView("modifyvehicle");
      }
      @RequestMapping(value="/updatevehicle")
      public ModelAndView meth9(@RequestParam("VEHICLEID")String vid,@RequestParam("SEATINGCAPACITY")String sc)
      {
    	  return new ModelAndView("vehicles","vbb",adminservice.modifyVehicle(vid,sc));
      }
      @RequestMapping(value="/addDriver")
      public ModelAndView meth10()
      {
    	  return new ModelAndView("adddriver");
      }
      @RequestMapping(value="/newdriver")
      public ModelAndView meth11(@ModelAttribute("db")DriverBean db)
      {
    	  System.out.println(adminservice.addDriver(db));
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/deleteDriver")
      public ModelAndView meth12()
      {
    	  return new ModelAndView("deletedriver");
      }
      @RequestMapping(value="/removedriver")
      public ModelAndView meth13(@RequestParam("DRIVERID")String did)
      {
    	  System.out.println(adminservice.deleteDriver(did));
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/allotDriver")
      public ModelAndView meth14()
      {
    	  return new ModelAndView("allotdriver");
      }
      @RequestMapping(value="/givedriver")
      public ModelAndView meth15(@RequestParam("RESERVATIONID")String rid,@RequestParam("DRIVERID")String did)
      {
    	  adminservice.allotDriver(rid, did);
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/modifyDriver")
      public ModelAndView meth16()
      {
    	  return new ModelAndView("modifydriver");
      }
      @RequestMapping(value="/updatedriver")
      public ModelAndView meth17(@RequestParam("DRIVERID")String did,@RequestParam("MOBILENO")String mob)
      {
    	  adminservice.modifyDriver(did, mob);
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/addRoute")
      public ModelAndView meth18()
      {
    	  return new ModelAndView("addroute");
      }
      @RequestMapping(value="/newroute")
      public ModelAndView meth19(@ModelAttribute("rb")RouteBean rb)
      {
    	  System.out.println(adminservice.addRoute(rb));
    	  return new ModelAndView("success");
      }

      @RequestMapping(value="/deleteRoute")
      public ModelAndView meth20()
      {
    	  return new ModelAndView("deleteroute");
      }
      @RequestMapping(value="/removeroute")
      public ModelAndView meth21(@RequestParam("ROUTEID")String rid)
      {
    	  System.out.println(adminservice.deleteRoute(rid));
    	  return new ModelAndView("success");
      }
      @RequestMapping(value="/viewRoute")
      public ModelAndView meth22()
      {
    	  return new ModelAndView("viewroute");
      }
      @RequestMapping(value="/showroute")
      public ModelAndView meth23(@RequestParam("ROUTEID")String rid)
      {
    	  return new ModelAndView("routes","vbb",adminservice.viewRoute(rid));
      }
      @RequestMapping(value="/viewBooking")
      public ModelAndView meth24()
      {
    	  List al=new ArrayList();
    	  al=adminservice.viewBookingDetails();
    	  return new ModelAndView("viewbooking","vbb",al);
      }
     
}
