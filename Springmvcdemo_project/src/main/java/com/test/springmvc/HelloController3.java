package com.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController3 {
	@RequestMapping("/hello2")
	// read the provided form data
	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m) {
		if (pass.equals("admin")) {
			String msg = "Hello " + name;
			// add a message to the model
			m.addAttribute("message", msg);
			return "welcome";
		} else {
			String msg = "sorry " + name + " .you entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}
	}
}
