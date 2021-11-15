package TestClass;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass_Main;
import com.Client.get_RestClient;

import io.restassured.RestAssured;

public class GetApITestClass extends BaseClass_Main
{
	BaseClass_Main TestBase ;
	String actulUrl;
	get_RestClient rest;
	String url ;
	String ServiceUrl;
	@BeforeClass
	
	public void setup() {
		RestAssured.useRelaxedHTTPSValidation();
		}
	
	@BeforeMethod
	
	public void SetUp() throws ClientProtocolException, IOException
	{
		
		
		TestBase =new BaseClass_Main();
		
	    url=prop.getProperty("URL");
		
	    ServiceUrl=prop.getProperty("serviceUrl");
		
		 actulUrl= url + ServiceUrl;
     System.out.println(actulUrl);		
 }
	@Test
	public void getTest() throws ClientProtocolException, IOException
	{
       rest=new get_RestClient();
		rest.get(actulUrl);
		
	}
@AfterMethod
public void m21()
{
	
	
}
@AfterClass
public void m2()
{
	
}
 
}
