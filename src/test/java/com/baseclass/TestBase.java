package com.baseclass;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	public static RequestSpecification httprequest;
	public static Response response;
	public String empID = "1";
	
	public Logger logger;
	
	@BeforeClass
	public void setup()
	{
	logger=Logger.getLogger(TestBase.class.getName());
	PropertyConfigurator.configure("C:\\Users\\itsdi\\eclipse-workspace\\RestAssuredFrameWork\\log4j.properties");
	logger.setLevel(Level.DEBUG);
}



}
