package com.shashi.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClockServiceTest {
@InjectMocks
ClockService clockService;

@Mock
ClockServiceImpl clockServiceImpl;

public void getTimeStringTest() {
	
	String time = "It's midday";
	
	when(clockServiceImpl.getTimeStr(0, 0)).thenReturn(time);
	String currentTime = clockServiceImpl.getTimeStr(0, 0);
	assertThat(currentTime).isEqualTo(time);
}

}
