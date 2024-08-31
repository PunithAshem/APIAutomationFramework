package api.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.endpoints.UserEndPoints;
import api.payload.Data;
import api.payload.Product;
import io.restassured.response.Response;

public class TestCase

{
    
	String id;
	@Test(priority = 1)

	public void testPostObject() throws Exception

	{

		//Data data = new Data("Cloudy White Grey", "590 GB");
		//Product payload = new Product("Google Pixel 6 Pro 15 Series", data);
		//ObjectMapper objMap = new ObjectMapper();
		
		Map userPayload1 = new LinkedHashMap();
		userPayload1.put("name", "Google Pixel 6 Pro 15 Series");
		
		Map userPayload2 = new LinkedHashMap();
		userPayload2.put("color", "Cloudy White Grey");
		userPayload2.put("capacity", "290 GB");
		
		userPayload1.put("data", userPayload2);

		//String userPayload1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);

		Response response = UserEndPoints.createOject(userPayload1);
		response.getBody().prettyPrint();
		String id = response.jsonPath().getString("id");
		Assert.assertEquals(response.getStatusCode(), 200);
		this.id=id;
		
			

	}
	
	
 	@Test(priority =2, dependsOnMethods = "testPostObject") 
	
	public void testGetObject()
	{
	  Response response = UserEndPoints.getObject(id);
	  response.getBody().prettyPrint();
	  response.body();
	  Assert.assertEquals(response.getStatusCode(), 200);
		
	}

	
	@Test(priority=3, dependsOnMethods = "testPostObject")
	public void testUpdateObject() throws Exception
	{
	//	Data data = new Data("Cloudy White", "595 GB");
	//	Product payload = new Product("Google Pixel 10 Pro", data);
	//	ObjectMapper objMap = new ObjectMapper();
		
		

		Map userPayload1 = new LinkedHashMap();
		userPayload1.put("name", "Google Pixel 6 Pro 15 Series");
		
		Map userPayload2 = new LinkedHashMap();
		userPayload2.put("color", "Cloudy White Grey");
		userPayload2.put("capacity", "295 GB");
		
		userPayload1.put("data", userPayload2);
		

	//	String updatePayload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		Response response = UserEndPoints.updateObject(id, userPayload1);
		response.getBody().prettyPrint();
		Assert.assertEquals(response.statusCode(), 200);
		

	}
	
	@Test(priority=4, dependsOnMethods = "testPostObject")
	public void deleteObject()
	{
	  Response response = UserEndPoints.deleteObject(id);
	  response.getBody().prettyPrint();
	  Assert.assertEquals(response.statusCode(), 200);
	}
	
}
