package com.ey.ata.dao;

import java.util.List;

import com.ey.ata.bean.DriverBean;
import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;

public interface AdministratorDao {
	public String addVehicle(VehicleBean vehicleBean);
	public int deleteVehicle(String vehicleID);
	public VehicleBean viewVehicle(String vehicleID); 
	public VehicleBean modifyVehicle(String vid,String cp);
	public String addDriver(DriverBean driverBean);
	public int deleteDriver(String driverID);
	public boolean allotDriver(String reservationID, String driverID);
	public DriverBean modifyDriver(String did,String mob);
	public String addRoute(RouteBean routeBean); 
	public int deleteRoute(String routeID);
	public RouteBean viewRoute(String routeID);
	public List viewBookingDetails();

}
