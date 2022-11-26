package com.shashi.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClockControllerTest {
	
	@InjectMocks
	ClockController clockController;
	
	@Mock
	ClockService clockService;
	
	@Test
	public void getTimeTest() {
		
		String time = "It's four forteen";
		
		when(clockService.getTime()).thenReturn(time);
		String currentTime  = clockController.getTime();
		assertThat(currentTime).isEqualTo(time);
	}

}
