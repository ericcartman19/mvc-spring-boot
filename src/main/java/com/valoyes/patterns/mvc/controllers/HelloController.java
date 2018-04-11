package com.valoyes.patterns.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// marcamos la clase como controller
@Controller	
public class HelloController {

	// asignamos un mapping, es decir el url al cual esta clase va a responder
	@RequestMapping("/hello")
	public String hello() {
		// esta es la view que mostrara esta informacion
		return "helloMVC";
	}
}
