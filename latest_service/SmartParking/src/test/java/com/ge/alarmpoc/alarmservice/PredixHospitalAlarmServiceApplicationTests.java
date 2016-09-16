package com.ge.alarmpoc.alarmservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ge.smartparking.service.PredixSmartParkingServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PredixSmartParkingServiceApplication.class)
@WebAppConfiguration
@PropertySource("classpath:application.properties")
public class PredixHospitalAlarmServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
