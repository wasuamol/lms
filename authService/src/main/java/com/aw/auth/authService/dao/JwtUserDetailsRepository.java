package com.aw.auth.authService.dao;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class JwtUserDetailsRepository {
	  private static final String encrptedPass = "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6";  //password
			   
		public User getUser(String usserName) throws UsernameNotFoundException {
			if ("amol".equals(usserName)) {
				return new User("amol", encrptedPass ,
						new ArrayList<>());
			}else if ("john".equals(usserName)) {
				return new User("john", encrptedPass,
						new ArrayList<>());
			}else if ("sundar".equals(usserName)) {
				return new User("sundar", encrptedPass,
						new ArrayList<>());
			}else {
				throw new UsernameNotFoundException("User not found with username: " + usserName);
			}
		}
}
