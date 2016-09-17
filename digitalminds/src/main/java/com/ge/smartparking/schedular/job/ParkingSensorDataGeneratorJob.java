package com.ge.smartparking.schedular.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ParkingSensorDataGeneratorJob extends QuartzJobBean {
	
	private ParkingSensorDataGeneratorTask parkingSensorDataGeneratorTask;
	
	public ParkingSensorDataGeneratorTask getParkingSensorDataGeneratorTask() {
		return parkingSensorDataGeneratorTask;
	}

	public void setParkingSensorDataGeneratorTask(ParkingSensorDataGeneratorTask sensorDataGeneratorTask) {
		this.parkingSensorDataGeneratorTask = sensorDataGeneratorTask;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		getParkingSensorDataGeneratorTask().generateParkingSlotSensorData();
	}
}
