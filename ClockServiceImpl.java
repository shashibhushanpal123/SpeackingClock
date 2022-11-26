package com.shashi.demo;

import org.springframework.stereotype.Service;

@Service
public class ClockServiceImpl {

	public String getTimeStr(int hours, int min) {

		String[] strTime = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine", "thirty", "thirty-one", "thirty-two", "thirty-three",
				"thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
				"forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
				"forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four",
				"fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty" };

		if ((hours == 00 || hours == 0) && min == 00) {
			return "It's midnight";
		}

		if (hours == 12 && min == 0) {
			return "It's midday";
		}

		else {
			return "It's " + " " + strTime[hours] + " " + strTime[min] + " ";
		}

	}

}
