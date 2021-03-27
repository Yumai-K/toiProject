package com.toi.proto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toi.proto.domain.TestDomain;
import com.toi.proto.service.TestService;
//This is Git Test
@RestController
@RequestMapping("/")
public class TestController {
	TestService testService;

	@Autowired
	public TestController(TestService testService) {
		this.testService = testService;
	}
	
	@GetMapping("Test")
	public List<TestDomain>  getTest() {
		return testService.getTest();
	}
}
