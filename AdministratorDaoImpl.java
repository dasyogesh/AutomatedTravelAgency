package com.ey.ata.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ey.ata.bean.DriverBean;
import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;
@Repository("admindao")
public class AdministratorDaoImpl implements AdministratorDao{
	@Autowired
private SessionFactory sessionFactory;
	@Override
	public String addVehicle(VehicleBean vehicleBean) {
		if(vehicleBean!=null) {
			sessionFactory.getCurrentSession().save(vehicleBean);
			return "success";
		}
		return null;
	}

	@Override
	public int deleteVehicle(String vehicleID) {
		VehicleBean vb=(VehicleBean)sessionFactory.getCurrentSession().get(VehicleBean.class,vehicleID);
		sessionFactory.getCurrentSession().delete(vb);
		return 1;
	}

	@Override
	public VehicleBean viewVehicle(String vehicleID) {
		VehicleBean vb=(VehicleBean)sessionFactory.getCurrentSession().get(VehicleBean.class,vehicleID);
		return vb;
	}

	@Override
	public VehicleBean modifyVehicle(String vid,String sc) {
		 VehicleBean vb=(VehicleBean)sessionFactory.getCurrentSession().get(VehicleBean.class,vid);
   	  vb.setSEATINGCAPACITY(sc);
   	  return vb;
	}

	@Override
	public String addDriver(DriverBean driverBean) {
		if(driverBean!=null) {
			sessionFactory.getCurrentSession().save(driverBean);
			return "success";
		}
		return null;
	}

	@Override
	public int deleteDriver(String driverID) {
		DriverBean db=(DriverBean)sessionFactory.getCurrentSession().get(DriverBean.class,driverID);
		sessionFactory.getCurrentSession().delete(db);
		return 1;
	}

	@Override
	public boolean allotDriver(String reservationID, String driverID) {
		DriverBean db=(DriverBean)sessionFactory.getCurrentSession().get(DriverBean.class,driverID);
		ReservationBean rb=(ReservationBean)sessionFactory.getCurrentSession().get(ReservationBean.class,reservationID);
		rb.setDRIVERID(driverID);
		return false;
	}

	@Override
	public DriverBean modifyDriver(String did,String mob) {
		
			DriverBean db=(DriverBean)sessionFactory.getCurrentSession().get(DriverBean.class,did);
			db.setMOBILENO(mob);
			return db;	
	}

	@Override
	public String addRoute(RouteBean routeBean) {
		if(routeBean!=null) {
			sessionFactory.getCurrentSession().save(routeBean);
			return "success";
		}
		return null;
	}

	@Override
	public int deleteRoute(String routeID) {
		RouteBean vb=(RouteBean)sessionFactory.getCurrentSession().get(RouteBean.class,routeID);
		sessionFactory.getCurrentSession().delete(vb);
		return 1;
	}

	@Override
	public RouteBean viewRoute(String routeID) {
		RouteBean rb=(RouteBean)sessionFactory.getCurrentSession().get(RouteBean.class,routeID);
		return rb;
	}

	@Override
	public List viewBookingDetails() {
		List<ReservationBean> cl=new ArrayList();
		cl = sessionFactory.getCurrentSession().createQuery("FROM ReservationBean").list();
		return cl;
	}

}
