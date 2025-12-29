package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.User;

@Mapper
public interface UserMapper {
	User findById(String id);
	void userRegist(User user);
	
}
