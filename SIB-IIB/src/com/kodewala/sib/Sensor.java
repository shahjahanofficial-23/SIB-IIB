package com.kodewala.sib;

public class Sensor {
	private static int sensorsCreated;
	private static String systemStatus;
	private int sensorId;
	private double reading;
	
	// Runs once when Sensor is loaded
	static {
		sensorsCreated = 0;
		systemStatus = "Ready";
		System.out.println("Static block: sensor system started");
	}
	
	{
		sensorsCreated++;
		sensorId = sensorsCreated;
		reading = 0.0;
		System.out.println("Instance block: preparing sensor " + sensorId);
	}
	
	public Sensor(double initialReading) {
		reading = initialReading;
	}
	
	public void display() {
		System.out.println("Sensor " + sensorId + ", reading: " + reading + ", system: " +systemStatus);
	}
	
	public static void main(String[] args) {
		Sensor first = new Sensor(23.5);
		Sensor second = new Sensor(19.8);
		
		first.display();
		second.display();
		System.out.println("Sensors created: " + sensorsCreated);
	}
}
