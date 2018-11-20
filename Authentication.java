package com.ey.ata.util;
import com.ey.ata.bean.*;
public interface Authentication {
	public boolean Authenticate(String uid,String pwd) ;
	public boolean Authenticate1(String uid,String pwd) ;
	public String Authorize(String userid);
	public boolean changeLoginStatus(CredentialsBean credentialbean, int loginstatus);
	
} 