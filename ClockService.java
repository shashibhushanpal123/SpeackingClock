package com.shashi.demo;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClockService {

	Logger log = LoggerFactory.getLogger(ClockService.class);

	@Autowired
	private ClockServiceImpl clockServiceImpl;

	public String getTime() {

		log.info("Inside service class : -");
		String stringTime = " ";
		LocalDateTime now = LocalDateTime.now();
		int hours = now.getHour();
		int min = now.getMinute();
		if (hours <= 24 && min <= 60) {
			stringTime = clockServiceImpl.getTimeStr(hours, min);
		}
		return stringTime;
	}

}
