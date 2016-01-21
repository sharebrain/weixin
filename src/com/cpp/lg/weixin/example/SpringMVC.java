package com.cpp.lg.weixin.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Controller
public class SpringMVC {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {

		return "success";

	}

}
