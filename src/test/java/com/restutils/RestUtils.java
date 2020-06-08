package com.restutils;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String empname() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Arti" + generatedString);
		
	}
	public static String empSalary() {
		String generatedSal = RandomStringUtils.randomNumeric(5);
		return generatedSal;
		
	}
	public static String empAge() {
		String generatedString = RandomStringUtils.randomNumeric(2);
		return generatedString;
		
	}
	

}
