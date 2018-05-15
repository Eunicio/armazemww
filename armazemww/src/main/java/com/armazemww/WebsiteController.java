package com.armazemww;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

	@RequestMapping("/website")
	public String website() {
		return "website";
	}
}
