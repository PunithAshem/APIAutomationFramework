package api.endpoints;



import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	
	  
	
	public static Response createOject(Map userPayload1)
	{
		Response response = given()
		   .contentType(ContentType.JSON)
		   .accept(ContentType.JSON)
		   .body(userPayload1)
		.when()
		   .post(Routes.post_url);
		
		
		return response;		
		
	}
	
	
	public static Response getObject(String id)
	
	
	{
		
		Response response = given()
		   .pathParam("id", id)
		   
		   
	    
		    .when()
		         .get(Routes.get_url);
		  
		   
		   return response;
		
		
	}
	
	
	public static Response updateObject(String id, Map payload)
	{
		Response response = given()
		   .contentType(ContentType.JSON)
		   .accept(ContentType.JSON)
		   .pathParam("id", id)
		   .body(payload)
		.when()
		   .put(Routes.update_url);
		
		
		return response;		
		
	}
	
	
   public static Response deleteObject(String id)
	
	
	{
		
		Response response = given()
		   .pathParam("id", id)
		
		
		  .when()
		   .delete(Routes.delete_url);
		  
		   
		   return response;
		
		
	}	
}
