package com.ey.ata.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ey.ata.bean.CredentialsBean;
@Service("auth")
@Transactional
public class AuthenticationImpl implements Authentication {
      @Autowired
      private SessionFactory sessionFactory;
     
     //private CredentialsBean cb;
      public static String x;
	@Override
	public boolean Authenticate(String uid,String pwd) {
		System.out.println("under auth");
		// TODO Auto-generated method stub
		CredentialsBean cb=(CredentialsBean)sessionFactory.getCurrentSession().get(CredentialsBean.class, uid);
		System.out.println(cb.getPass());
		if(cb!=null && cb.getUsertype().equals("A"))
		{
			String a=Authorize(uid);
			System.out.println(a);
			
			return true;
		}
		return false;
	}
	@Override
	public boolean Authenticate1(String uid, String pwd) {
		// TODO Auto-generated method stub
		CredentialsBean cb=(CredentialsBean)sessionFactory.getCurrentSession().get(CredentialsBean.class, uid);
		System.out.println(cb.getPass());
		if(cb!=null && cb.getUsertype().equals("C"))
		{
			String a=Authorize(uid);
			System.out.println(a);
			x=cb.getUSERID();
			return true;
			
		}
		return false;
	
	}

	@Override
	public String Authorize(String userid) {
		//TODO Auto-generated method stub
		CredentialsBean cb=(CredentialsBean)sessionFactory.getCurrentSession().get(CredentialsBean.class, userid);
		cb.setUSERID(userid);
		boolean x=changeLoginStatus(cb,1);
		return "success";
	}

	@Override
	public boolean changeLoginStatus(CredentialsBean credentialbean, int loginstatus) {
		// TODO Auto-generated method stub
		CredentialsBean cb=(CredentialsBean)sessionFactory.getCurrentSession().get(CredentialsBean.class, credentialbean.getUSERID());
		if(cb!=null) {
		cb.setLOGINSTATUS(loginstatus);
		sessionFactory.getCurrentSession().update(cb);
		User u1= new UserImpl();
		String t=u1.login(credentialbean);
		return true;
		}
		return false;
	}

	

}
