package com.testcase;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class DeleteRecord extends TestBase{
	@BeforeClass
	void PutEmployee() throws InterruptedException{
		logger.info("Started TC005_Delete_Employee_Record");
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		httprequest=RestAssured.given();
//      response = httprequest.request(Method.GET,"/employees");
//      JsonPath jsonpath = response.jsonPath();
//      String empID = jsonpath.getString("(0).id");
        System.out.println("=======================>"+empID);
        
        response = httprequest.request(Method.DELETE,"/delete/"+ empID);
        
	}
	@Test
    void checkResponseBody()
{
	logger.info("  ** Checking Respose Body");
	String responsebody=response.getBody().asString();
	System.out.println("Response body is: " +responsebody);

}

	@Test
    void checkStatuscode()
{
	logger.info("  ** Checking Staus code ");
	int statuscode=response.getStatusCode();
	System.out.println("The status code is" + statuscode);
	Assert.assertEquals(statuscode, 200);

}
	@Test
    void checkContentEncoding()
{
	logger.info("  ** Checking Content Encoding ");
	String contentencoding=response.header("Content-Encoding");
	System.out.println("Content Encoding is: " +contentencoding);

}
	
	@Test
    void checkStatusline()
    {
    	logger.info("  ** Checking Staus Line ");
    	String statusline=response.statusLine();
    	System.out.println("Status line is" + statusline);

    }
	@Test
    void checkContenttype()
{
	logger.info("  ** Checking Staus Line ");
	String contenttype=response.header("Content-Type");
	System.out.println("Content Type is : " +contenttype);
}

	
	@Test
    void getallheaders()
{
	logger.info("  ** Checking All headers ");
    Headers allheaders = response.headers();
    for (Header header:allheaders)
    {
    	System.out.println(header.getName()+"     :   " + header.getValue());
 	 	   
    }
    
}

	@Test
    void checkServertype()
     {
	logger.info("  ** Checking Server type");
	String servertype=response.header("Server");
	System.out.println("Server Type is : " +servertype);
}

	@Test
    void checkcookies()
{
	logger.info("  ** Checking Cookies");
	String cookies=response.getCookie("PHPSESSID");
	System.out.println("Content Type is : " +cookies);
}

	
	@Test
    void checkResponsetime()
     {
		logger.info("  ** Checking response time");
		long responsetime = response.getTime();
	   System.out.println("Server Type is : " +responsetime);
}



}
