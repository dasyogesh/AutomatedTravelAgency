package com.ey.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ATA_TBL_ROUTE")
public class RouteBean {
	@Id
    @Column(name="ROUTEID")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq3")
    @SequenceGenerator(name="my_seq3",sequenceName="demo_seq3")
	private String ROUTEID;
	
	@Column(name="SOURCE")
    private String SOURCE;
	
	@Column(name="DESTINATION")
    private String DESTINATION;
	
	@Column(name="DISTANCE")
    private int DISTANCE;
	
	@Column(name="TRAVELDURATION")
    private int TRAVELDURATION;
	public String getROUTEID() {
		return ROUTEID;
	}
	public void setROUTEID(String rOUTEID) {
		ROUTEID = rOUTEID;
	}
	public String getSOURCE() {
		return SOURCE;
	}
	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}
	public String getDESTINATION() {
		return DESTINATION;
	}
	public void setDESTINATION(String dESTINATION) {
		DESTINATION = dESTINATION;
	}
	public int getDISTANCE() {
		return DISTANCE;
	}
	public void setDISTANCE(int dISTANCE) {
		DISTANCE = dISTANCE;
	}
	public int getTRAVELDURATION() {
		return TRAVELDURATION;
	}
	public void setTRAVELDURATION(int tRAVELDURATION) {
		TRAVELDURATION = tRAVELDURATION;
	}

}
