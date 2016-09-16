package com.smartparking.schedular.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SensorDataGeneratorJob extends QuartzJobBean {
	
	private SensorDataGeneratorTask sensorDataGeneratorTask;
	
	public SensorDataGeneratorTask getSensorDataGeneratorTask() {
		return sensorDataGeneratorTask;
	}

	public void setSensorDataGeneratorTask(
			SensorDataGeneratorTask sensorDataGeneratorTask) {
		this.sensorDataGeneratorTask = sensorDataGeneratorTask;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		getSensorDataGeneratorTask().generateSensorData();
	}
}
