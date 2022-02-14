package com.lab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	@RequestMapping("/error")
	public void handleError(HttpServletRequest request) {
		throw new ResponseStatusException((HttpStatus) request.getAttribute("javax.servlet.error.status_code"), "Check you request params");
	}
	
	@Override
	public String getErrorPath() {
		return "/error";
	}

}
