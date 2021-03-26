package com.toi.proto.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toi.proto.domain.TestDomain;
import com.toi.proto.mapper.TestMapper;

@Service
public class TestService {
	@Resource
	TestMapper testMapper;
	
	@Autowired
	TestService(){
		
	}
	
	public List<TestDomain> getTest() {
		return testMapper.getTest();
	}
}
