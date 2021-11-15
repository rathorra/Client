package TestClass;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass_Main;
import com.Client.get_RestClient;

public class GetApITestClass extends BaseClass_Main
{
	BaseClass_Main TestBase ;
	String actulUrl;
	get_RestClient rest;
	String url ;
	String ServiceUrl;
	
	@BeforeMethod
	public void SetUp() throws ClientProtocolException, IOException
	{
		TestBase =new BaseClass_Main();
		
	    url=prop.getProperty("URL");
		
	    ServiceUrl=prop.getProperty("serviceUrl");
		
		 actulUrl= url + ServiceUrl;
		
 }
	@Test
	public void getTest() throws ClientProtocolException, IOException
	{
       rest=new get_RestClient();
		rest.get(actulUrl);
		
	}

}
