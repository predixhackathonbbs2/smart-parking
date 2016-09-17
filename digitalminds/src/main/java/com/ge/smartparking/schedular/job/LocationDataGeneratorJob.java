package com.ge.smartparking.schedular.job;

public class LocationDataGeneratorJob {
	
	private LocationDataGeneratorTask locationDataGeneratorTask;
	
	public LocationDataGeneratorTask getLocationDataGeneratorTask() {
		return locationDataGeneratorTask;
	}

	public void setLocationDataGeneratorTask(LocationDataGeneratorTask locationDataGeneratorTask) {
		this.locationDataGeneratorTask = locationDataGeneratorTask;
	}

	/*@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		getLocationDataGeneratorTask().generateLocationSensorData();
	}*/
}
