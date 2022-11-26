package com.shashi.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clock/time")
public class ClockController {
	Logger log = LoggerFactory.getLogger(ClockController.class);
	@Autowired
	private ClockService clockservice;

	@GetMapping("/getCurrentTime")
	public String getTime() {

		log.info("about to call serice : -");

		String timeInString = clockservice.getTime();

		return timeInString;
	}

}
