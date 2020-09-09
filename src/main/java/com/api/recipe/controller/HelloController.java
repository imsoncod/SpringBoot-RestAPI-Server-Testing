package com.api.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/sample")
@Controller
public class HelloController {
	@GetMapping
	@ResponseBody
	public String getSample() {
		return "sample";
	}
}
