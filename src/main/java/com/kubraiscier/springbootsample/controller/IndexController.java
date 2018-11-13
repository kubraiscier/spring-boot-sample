package com.kubraiscier.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kubraiscier
 *
 */
@Controller
public class IndexController {

	@GetMapping(value = "/")
	public ModelAndView handleRequest() {
		ModelAndView mv = new ModelAndView("index", "message", "Welcome to SpringBoot Sample Application");
		return mv;
	}

}
