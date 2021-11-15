package com.Client;

import java.io.IOException;
import java.util.HashMap;

import javax.net.ssl.SSLSession;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import sun.net.www.http.HttpClient;

public class get_RestClient 
{
	
	//1.GET Method 
		public void get(String url) throws ClientProtocolException, IOException
		{
			
			CloseableHttpClient httpClient=HttpClients.createDefault(); //create one client connection and return closeable clients
			
			HttpGet httpGet=new HttpGet(url);// http get request
			
			CloseableHttpResponse closeableHttpResponse =httpClient.execute(httpGet); //hit the get URL it return CloseableHttpResponse
			
			int statusCoad=closeableHttpResponse.getStatusLine().getStatusCode();//get status Coad
			
			
			System.out.println("statusCoad------>"+statusCoad);
			
			String responseString=EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");//get JSON String
			
			JSONObject responseJson=new JSONObject(responseString);//convert string to JSons 
			
			System.out.println("JSONS API------>"+responseJson);
			
			
			Header[] headerArray=closeableHttpResponse.getAllHeaders();//get all header and stor headerArray
			
			HashMap<String,String> allHeaders=new HashMap<String,String>();
			
			for(Header header:headerArray)
			{
				allHeaders.put(header.getName(), header.getValue());
			}
			System.out.println("allHeaders-->"+allHeaders);
}

		public boolean verify(String arg0, SSLSession arg1) {
			// TODO Auto-generated method stub
			return false;
		}
		}

