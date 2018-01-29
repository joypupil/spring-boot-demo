package com.example.base.controller;

import com.example.base.dto.TestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/base")
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public TestResponse test(HttpServletRequest request, HttpServletResponse response) {
		TestResponse testResponse = new TestResponse();
		testResponse.setParam1("a");
		testResponse.setParam2("b");
		return testResponse;
	}
}
