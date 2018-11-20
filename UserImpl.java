package com.ey.ata.util;
import java.util.*;

import java.lang.*;
import javax.swing.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.sql.PreparedStatement;

import com.ey.ata.bean.CredentialsBean;
import com.ey.ata.bean.ProfileBean;
@Service("u")
@Transactional

public class UserImpl extends AuthenticationImpl implements User {
              @Autowired
              private SessionFactory sessionFactory;
              
              public static String x;
              @Override
              public String login(CredentialsBean credentialsBean) {
                             // TODO Auto-generated method stub
            	    if(credentialsBean!=null) {
            	  	System.out.println(credentialsBean.getUsertype());
                             return "success";
            	    }
            	    return null;
              }

              @Override
              public boolean logout(CredentialsBean credentialbean) {
                             // TODO Auto-generated method stub
                             
            	  
                             return false;
              }

              @Override
              public String changePassword(CredentialsBean credentialsBean, String newPassword) {
                             // TODO Auto-generated method stub
                             return null;
              }

              @Override
              public String register(CredentialsBean cb) {
            	 
                             // TODO Auto-generated method stub
                             if(cb!=null)
                             {
                            
                            sessionFactory.getCurrentSession().save(cb);
                            x=cb.getUSERID();
                            System.out.println(x);
                            return "success";
              }
                             return null;

}

			@Override
			public String register1(ProfileBean pb) {
				// TODO Auto-generated method stub
				System.out.println("inside register");
				pb.setUserID(x);
				if(pb!=null) {
					System.out.println(pb.getUserID());
					sessionFactory.getCurrentSession().save(pb);
					return "success";
				}
				return null;
			}
}
