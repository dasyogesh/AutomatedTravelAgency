package com.ey.ata.util;

import com.ey.ata.bean.CredentialsBean;
import com.ey.ata.bean.ProfileBean;

public interface User {
		public String login(CredentialsBean credentialsBean);
		public boolean logout(CredentialsBean credentialsBean);
		public String changePassword(CredentialsBean credentialsBean, String 
				 newPassword);
		public String register(CredentialsBean credentialsBean); 
		public String register1(ProfileBean profileBean); 

}
