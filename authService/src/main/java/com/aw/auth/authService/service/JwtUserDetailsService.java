package com.aw.auth.authService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aw.auth.authService.dao.JwtUserDetailsRepository;



@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	JwtUserDetailsRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return repository.getUser(username);
	}

}
