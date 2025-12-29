package com.example.demo.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.User;
import com.example.demo.mapper.UserMapper;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	private final UserMapper userMapper;
	public CustomUserDetailsService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public UserDetails loadUserByUsername(String id) {
		User user = userMapper.findById(id);
		
		if(user == null) {
			throw new UsernameNotFoundException("아이디 없음");
		}
		return new CustomUserDetails(user);
	}
}
