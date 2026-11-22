package com.kodewala.sib;

public class Configuration {
	static String applicationName;
	static int maxUsers;
	
	// Runs once when Configuration is loaded
	static {
		applicationName = "Library Manager";
		maxUsers = 100;
		System.out.println("Static block: configuration loaded");
	}
	
	public void display() {
		System.out.println(applicationName + " supports " + maxUsers + " users.");
	}
	
	public static void main(String[] args) {
		Configuration first = new Configuration();
		Configuration second = new Configuration();
		
		first.display();
		second.display();
	}

}
