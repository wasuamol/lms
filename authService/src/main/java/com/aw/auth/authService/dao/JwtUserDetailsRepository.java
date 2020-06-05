package com.aw.auth.authService.dao;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class JwtUserDetailsRepository {
	  private static final String encrptedPass = "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6";  //password
			   
		public User getUser(String usserName) throws UsernameNotFoundException {
			if ("amol@gmail.com".equals(usserName)) {
				return new User("amol@gmail.com", encrptedPass ,
						new ArrayList<>());
			}else if ("john@gmail.com".equals(usserName)) {
				return new User("john@gmail.com", encrptedPass,
						new ArrayList<>());
			}else if ("sundar@gmail.com".equals(usserName)) {
				return new User("sundar@gmail.com", encrptedPass,
						new ArrayList<>());
			}else {
				throw new UsernameNotFoundException("User not found with username: " + usserName);
			}
		}
}
