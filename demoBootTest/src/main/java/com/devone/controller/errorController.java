package com.devone.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class errorController implements ErrorController {
	private static final String PATH="/error1";
	@Override
	public String getErrorPath() {
		return PATH;
	}
	@RequestMapping(PATH)
	public String error(){
		return "No mapping available";
	}

}
