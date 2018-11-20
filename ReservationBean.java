package com.ey.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ATA_TBL_RESERVATION")
public class ReservationBean {
    @Id
    @Column(name="RESERVATIONID")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq4")
    @SequenceGenerator(name="my_seq4",sequenceName="demo_seq4")
    private String RESERVATIONID;
    @Column(name="USERID")
    private String USERID;
    
    @Column(name="VEHICLEID")
    private String VEHICLEID;
    
    @Column(name="ROUTEID")
    private String ROUTEID;
    
    @Column(name="BOOKINGDATE")
	private String BOOKINGDATE;
    
    @Column(name="JOURNEYDATE")
	private String JOURNEYDATE;
    
    @Column(name="DRIVERID")
	private String DRIVERID;
    
    @Column(name="BOOKINGSTATUS")
	private String BOOKINGSTATUS;
    
    @Column(name="TOTALFARE")
	private double TOTALFARE;
    
    @Column(name="BOARDINGPOINT")
	private String BOARDINGPOINT;
    
    @Column(name="DROPPOINT")
	private String DROPPOINT;
	public String getRESERVATIONID() {
		return RESERVATIONID;
	}
	public void setRESERVATIONID(String rESERVATIONID) {
		RESERVATIONID = rESERVATIONID;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public String getVEHICLEID() {
		return VEHICLEID;
	}
	public void setVEHICLEID(String vEHICLEID) {
		VEHICLEID = vEHICLEID;
	}
	public String getROUTEID() {
		return ROUTEID;
	}
	public void setROUTEID(String rOUTEID) {
		ROUTEID = rOUTEID;
	}
	public String getBOOKINGDATE() {
		return BOOKINGDATE;
	}
	public void setBOOKINGDATE(String bOOKINGDATE) {
		BOOKINGDATE = bOOKINGDATE;
	}
	public String getJOURNEYDATE() {
		return JOURNEYDATE;
	}
	public void setJOURNEYDATE(String jOURNEYDATE) {
		JOURNEYDATE = jOURNEYDATE;
	}
	public String getDRIVERID() {
		return DRIVERID;
	}
	public void setDRIVERID(String dRIVERID) {
		DRIVERID = dRIVERID;
	}
	public String getBOOKINGSTATUS() {
		return BOOKINGSTATUS;
	}
	public void setBOOKINGSTATUS(String bOOKINGSTATUS) {
		BOOKINGSTATUS = bOOKINGSTATUS;
	}
	public double getTOTALFARE() {
		return TOTALFARE;
	}
	public void setTOTALFARE(double tOTALFARE) {
		TOTALFARE = tOTALFARE;
	}
	public String getBOARDINGPOINT() {
		return BOARDINGPOINT;
	}
	public void setBOARDINGPOINT(String bOARDINGPOINT) {
		BOARDINGPOINT = bOARDINGPOINT;
	}
	public String getDROPPOINT() {
		return DROPPOINT;
	}
	public void setDROPPOINT(String dROPPOINT) {
		DROPPOINT = dROPPOINT;
	}
	

}
