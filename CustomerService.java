package com.ey.ata.service;

import java.util.ArrayList;
import java.util.List;

import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;

public interface CustomerService {
	public List viewVehiclesByType(String vehicleType);
	public List viewVehicleBySeats(int noOfSeats);
	public List viewAllRoutes(); 
	public String bookVehicle(ReservationBean reservationBean);
	public boolean cancelBooking(String userID, String reservationID);
	public ReservationBean viewBookingDetails(String reservationID);
	public ReservationBean printBookingDetails(String reservationID); 

}
