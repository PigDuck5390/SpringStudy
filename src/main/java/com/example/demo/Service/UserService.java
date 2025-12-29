package com.example.demo.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	private final UserMapper userMapper;
	private final PasswordEncoder passwordEncoder;
	// 생성자 주입(의존성 주입)
	public UserService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
		this.userMapper = userMapper;
		this.passwordEncoder = passwordEncoder;
	}
	public User getUser(String id) {
		return userMapper.findById(id);
	}
	public void SignUp(User user) {
		String encodePw = passwordEncoder.encode(user.getPw());
		user.setPw(encodePw);
		userMapper.userRegist(user);
	}
}
