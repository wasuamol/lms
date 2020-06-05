package com.aw.auth.authService.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private String username;
		private String password;
		private String type;
		
		//need default constructor for JSON Parsing
		public JwtRequest()
		{
			
		}

		public JwtRequest(String username, String password, String type) {
			this.setUsername(username);
			this.setPassword(password);
			this.setType(type);
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		

}
