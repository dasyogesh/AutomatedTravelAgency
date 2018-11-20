package com.ey.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ATA_TBL_DRIVER")
public class DriverBean {
    @Id
    @Column(name="DRIVERID")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq1")
    @SequenceGenerator(name="my_seq1",sequenceName="demo_seq1")
    private String DRIVERID;
    
    @Column(name="NAME")
	private String NAME;
    
    @Column(name="STREET")
	private String STREET;
    
    @Column(name="LOCATION")
	private String LOCATION;
    
    @Column(name="CITY")
	private String CITY;
    
    @Column(name="STATE")
	private String STATE;
    
    @Column(name="PINCODE")
	private String PINCODE;
    
    @Column(name="MOBILENO")
	private String MOBILENO;
    
    @Column(name="LICENSENUMBER")
	private String LICENSENUMBER;
	public String getDRIVERID() {
		return DRIVERID;
	}
	public void setDRIVERID(String dRIVERID) {
		DRIVERID = dRIVERID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSTREET() {
		return STREET;
	}
	public void setSTREET(String sTREET) {
		STREET = sTREET;
	}
	public String getLOCATION() {
		return LOCATION;
	}
	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(String pINCODE) {
		PINCODE = pINCODE;
	}
	public String getMOBILENO() {
		return MOBILENO;
	}
	public void setMOBILENO(String mOBILENO) {
		MOBILENO = mOBILENO;
	}
	public String getLICENSENUMBER() {
		return LICENSENUMBER;
	}
	public void setLICENSENUMBER(String lICENSENUMBER) {
		LICENSENUMBER = lICENSENUMBER;
	}

}
