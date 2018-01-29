package com.xi.myspring.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("test/xi")
public class TestController {
	 private static Logger logger = Logger.getLogger(TestController.class);  
	
	@RequestMapping(value = "/exec",method = RequestMethod.GET)
	public String query(HttpServletRequest re,Model modle){
		String a = re.getParameter("aaa");
		System.out.println("==========================="+a+"======================================");
		logger.debug("========测试开始---------------");
		logger.error("===============错误日志=========================");
		return "111111111111111111111";
	}
}
