package com.armazemww;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

	@RequestMapping("/armazemww")
	public String website() {
		return "website";
	}
	
	@RequestMapping("/inicio")
	public String inicio() {
		return "inicio";
	}
}
