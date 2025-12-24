package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.Test;

@Mapper
public interface TestMapper {
	List<Test> findAll();
	Test UserDetail(String id);
	void InsertUser(Test test);
}
