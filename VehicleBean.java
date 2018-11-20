package com.ey.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ATA_TBL_VEHICLE")
public class VehicleBean {
    @Id
    @Column(name="VEHICLEID")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq2")
    @SequenceGenerator(name="my_seq2",sequenceName="demo_seq2")
    private String VEHICLEID;
    @Column(name="NAME")
    private String NAME;
    @Column(name="TYPE")
    private String TYPE;
    @Column(name="REGISTRATIONNUMBER")
    private String REGISTRATIONNUMBER;
    @Column(name="SEATINGCAPACITY")
    private String SEATINGCAPACITY;
    @Column(name="FAREPERKM")
    private String FAREPERKM;
	public String getVEHICLEID() {
		return VEHICLEID;
	}
	public void setVEHICLEID(String vEHICLEID) {
		VEHICLEID = vEHICLEID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getREGISTRATIONNUMBER() {
		return REGISTRATIONNUMBER;
	}
	public void setREGISTRATIONNUMBER(String rEGISTRATIONNUMBER) {
		REGISTRATIONNUMBER = rEGISTRATIONNUMBER;
	}
	public String getSEATINGCAPACITY() {
		return SEATINGCAPACITY;
	}
	public void setSEATINGCAPACITY(String sEATINGCAPACITY) {
		SEATINGCAPACITY = sEATINGCAPACITY;
	}
	public String getFAREPERKM() {
		return FAREPERKM;
	}
	public void setFAREPERKM(String fAREPERKM) {
		FAREPERKM = fAREPERKM;
	}

}
