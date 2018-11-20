package com.ey.ata.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table(name="ATA_TBL_USER_CREDENTIALS")
public class CredentialsBean {
             @Id
              @Column(name="USERID")
             @GeneratedValue(strategy=GenerationType.AUTO,generator="my_seq")
          	@SequenceGenerator(name="my_seq",sequenceName="demo_seq")
              private String USERID;
              @Column(name="PASSWORD")
              private String pass;
              @Column(name="USERTYPE")
              private String usertype;
              @Column(name="LOGINSTATUS")
              private int LOGINSTATUS;
              
			public String getUSERID() {
				return USERID;
			}
			public void setUSERID(String uSERID) {
				USERID = uSERID;
				
			}
			public String getPass() {
				return pass;
			}
			public void setPass(String pass) {
				this.pass = pass;
			}
			public String getUsertype() {
				return usertype;
			}
			public void setUsertype(String usertype) {
				this.usertype = usertype;
			}
			public int getLOGINSTATUS() {
				return LOGINSTATUS;
			}
			public void setLOGINSTATUS(int lOGINSTATUS) {
				//lOGINSTATUS=0;
				this.LOGINSTATUS = lOGINSTATUS;
			}
              
              
             

}
