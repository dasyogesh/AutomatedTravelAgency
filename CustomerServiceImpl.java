package com.ey.ata.service;


	import java.util.ArrayList;
    import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import com.ey.ata.bean.ProfileBean;
import com.ey.ata.bean.ReservationBean;
import com.ey.ata.bean.RouteBean;
import com.ey.ata.bean.VehicleBean;
import com.ey.ata.dao.CustomerDao;
	@Service("custservice")
	@Transactional
	public class CustomerServiceImpl implements CustomerService {
	@Autowired
		private CustomerDao custdao;
		
		@Override
		public List viewVehiclesByType(String vehicleType) {
			// TODO Auto-generated method stub
			return custdao.viewVehiclesByType(vehicleType) ;
		}
		@Override
		public List viewVehicleBySeats(int noOfSeats) {
			// TODO Auto-generated method stub
			return custdao.viewVehicleBySeats(noOfSeats);
		}
		@Override
		public List viewAllRoutes() {
			// TODO Auto-generated method stub
			return custdao.viewAllRoutes();
		}
		@Override
		public String bookVehicle(ReservationBean reservationBean) {
			// TODO Auto-generated method stub
			return custdao.bookVehicle(reservationBean);
		}
		
		@Override
		public ReservationBean viewBookingDetails(String reservationID) {
			// TODO Auto-generated method stub
			return custdao.viewBookingDetails(reservationID);
		}
		@Override
		public ReservationBean printBookingDetails(String reservationID) {
			// TODO Auto-generated method stub
			return custdao.printBookingDetails(reservationID);
		}
		@Override
		public boolean cancelBooking(String userID, String reservationID) {
			// TODO Auto-generated method stub
			return custdao.cancelBooking(userID, reservationID);
		}
		
		

	}

