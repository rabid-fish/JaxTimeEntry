package org.jaxtools.controller;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String getWelcome(ModelMap model) {
		model.addAttribute("message", "Hello and welcome to JaxTimeEntry!");
		return "welcome/welcome";
	}

	@RequestMapping(value = "/getTime", method = RequestMethod.GET)
	public @ResponseBody Map<String, ? extends Object> getTime() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:ss:mm");
		String time = format.format(new Date());
		return Collections.singletonMap("theTime", time);
	}

}
