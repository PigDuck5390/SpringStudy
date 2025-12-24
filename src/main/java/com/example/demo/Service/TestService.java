package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Domain.Test;
import com.example.demo.mapper.TestMapper;

@Service
public class TestService {
	// 생성자 주입
	private final TestMapper testMapper;
	public TestService(TestMapper testMapper) {
		this.testMapper = testMapper;
	}
	
	public List<Test> getList() {
		return testMapper.findAll();
	}
	public void SaveUser(Test test) {
		testMapper.InsertUser(test);
	}
	public Test getUserDetail(String id) {
		return testMapper.UserDetail(id);
	}

}
