package com.uniq.HotelManagement.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.Entity.User;
import com.uniq.HotelManagement.Repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user=userRepo.findByUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		return new UserPrinciple(user);
	}

}
