package com.ey.ata.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ey.ata.bean.ProfileBean;
import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;
import com.ey.ata.util.AuthenticationImpl;

@Repository("custdao")
public class CustomerDaoImpl implements CustomerDao{
	@Autowired   
	private SessionFactory sessionFactory;
		
		@Override
		public List viewVehiclesByType(String vehicleType) {
			List<VehicleBean> cl=new ArrayList();
			cl = sessionFactory.getCurrentSession().createQuery("FROM VehicleBean where TYPE='"+vehicleType+"'").list();
			return cl;
		}
		@Override
		public List viewVehicleBySeats(int noOfSeats) {
			List<VehicleBean> cl=new ArrayList();
			cl = sessionFactory.getCurrentSession().createQuery("FROM VehicleBean where SEATINGCAPACITY='"+noOfSeats+"'").list();
			return cl;
		}
		@Override
		public List viewAllRoutes() {
			List<RouteBean> cl=new ArrayList();
			 cl=sessionFactory.getCurrentSession().createQuery("from RouteBean").list();
			return cl;
		}
		@Override
		public String bookVehicle(ReservationBean rb) {
			if(rb!=null)
			{
				System.out.println(AuthenticationImpl.x);
				rb.setUSERID(AuthenticationImpl.x);
			sessionFactory.getCurrentSession().save(rb);
			return "success";
			}
			else
			return "failure";
		}
		
		@Override
		public ReservationBean viewBookingDetails(String id) {
			
			ReservationBean rb =(ReservationBean)sessionFactory.getCurrentSession().get(ReservationBean.class, id);
			return rb;
		}
		@Override
		public ReservationBean printBookingDetails(String id) {
			ReservationBean rb =(ReservationBean)sessionFactory.getCurrentSession().get(ReservationBean.class, id);
			return rb;
		}
		@Override
		public boolean cancelBooking(String userID, String reservationID) {
			// TODO Auto-generated method stub
			ReservationBean eb=(ReservationBean)sessionFactory.getCurrentSession().get(ReservationBean.class,reservationID);
			if(eb.getUSERID().equals(userID)) {
				sessionFactory.getCurrentSession().delete(eb);
			return true;
			}
			return false;
		}
		
}
