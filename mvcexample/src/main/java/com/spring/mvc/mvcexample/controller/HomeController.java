package com.spring.mvc.mvcexample.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/test")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("test");
	}
	
	
	@RequestMapping(value="/validate")
	public ModelAndView validate(HttpServletResponse response, HttpServletRequest request) throws IOException{
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		if( uname.equals("admin") && passwd.equals("admin"))
				return new ModelAndView("success");
		else	
			return new ModelAndView("fail");
	}
}


