package com.ey.ata.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="ATA_TBL_USER_PROFILE")
public class ProfileBean {
              @Id
              @Column(name="USERID")
              private String userID;
              @Column(name="FIRSTNAME")
    private String fname;
              @Column(name="LASTNAME")
    private String lname;
              @Column(name="DATEOFBIRTH")
    private String dob;
              @Column(name="GENDER")
    private String gender;
              @Column(name="STREET")
    private String street;
              @Column(name="LOCATION")
    private String location;
              @Column(name="CITY")
    private String city;
              @Column(name="STATE")
    private String state;
              @Column(name="PINCODE")
    private String pincode;
              @Column(name="MOBILENO")
    private String mobileno;
              @Column(name="EMAILID")
    private String emailid;
              
			public String getUserID() {
				return userID;
			}
			public void setUserID(String userID) {
				this.userID = userID;
			}
			public String getFname() {
				return fname;
			}
			public void setFname(String fname) {
				this.fname = fname;
			}
			public String getLname() {
				return lname;
			}
			public void setLname(String lname) {
				this.lname = lname;
			}
			public String getDob() {
				return dob;
			}
			public void setDob(String dob) {
				this.dob = dob;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getStreet() {
				return street;
			}
			public void setStreet(String street) {
				this.street = street;
			}
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getPincode() {
				return pincode;
			}
			public void setPincode(String pincode) {
				this.pincode = pincode;
			}
			public String getMobileno() {
				return mobileno;
			}
			public void setMobileno(String mobileno) {
				this.mobileno = mobileno;
			}
			public String getEmailid() {
				return emailid;
			}
			public void setEmailid(String emailid) {
				this.emailid = emailid;
			}
   
}
