package com.my.serviceIII.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
@RequestMapping(value="/Api")
public class ServiceApiController {
	@Value("${name}")
	private String name;
	
	@ResponseBody
	@RequestMapping(value="/getInfo")
	public String getInfo() {
		return "serviceIII+"+name;
	}
}
