package com.ey.ata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ey.ata.bean.DriverBean;
import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;
import com.ey.ata.dao.AdministratorDao;
@Service("adminservice")
@Transactional
public class AdministratorServiceImpl implements AdministratorService{
	@Autowired
private AdministratorDao admindao;

	@Override
	public String addVehicle(VehicleBean vehicleBean) {
		return admindao.addVehicle(vehicleBean);
	}

	@Override
	public int deleteVehicle(String vehicleID) {
		return admindao.deleteVehicle(vehicleID);
	}

	@Override
	public VehicleBean viewVehicle(String vehicleID) {
		return admindao.viewVehicle(vehicleID);
	}

	@Override
	public VehicleBean modifyVehicle(String vid,String sc) {
		return admindao.modifyVehicle(vid,sc);
	}

	@Override
	public String addDriver(DriverBean driverBean) {
		return admindao.addDriver(driverBean);
	}

	@Override
	public int deleteDriver(String driverID) {
		return admindao.deleteDriver(driverID);
	}

	@Override
	public boolean allotDriver(String reservationID, String driverID) {
		return admindao.allotDriver(reservationID, driverID);
	}

	@Override
	public DriverBean modifyDriver(String did,String mob) {
		return admindao.modifyDriver(did,mob);
	}

	@Override
	public String addRoute(RouteBean routeBean) {
		return admindao.addRoute(routeBean);
	}

	@Override
	public int deleteRoute(String routeID) {
		return admindao.deleteRoute(routeID);
	}

	@Override
	public RouteBean viewRoute(String routeID) {
		return admindao.viewRoute(routeID);
	}

	@Override
	public List viewBookingDetails() {
		return admindao.viewBookingDetails();
	}

}
