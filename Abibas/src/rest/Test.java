package rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;

import org.testng.Assert;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Specify the base URL to the RESTful web service
				RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
				RequestSpecification httpRequest = RestAssured.given();
				Response response = httpRequest.when().queryParam("status","available").get("findByStatus");
				String responseBody = response.getBody().asString();
				//JsonPath jpe=response.jsonPath();
				//String status=jpe.get("status");
				//System.out.println(status);
				System.out.println("Response Body is =>  " + responseBody);
				System.out.println("Response Code is =>  " + response.getStatusCode());
				//Assert.assertEquals(responseBody.contains("available"), true,"They matches");
				
			//JSONObject jse=new JSONObject();
			//jse.put("id",2);
			//jse.put("name","Scooby-Doo");
		    //jse.put("photoUrls","https://currentphotourl");
			httpRequest.header("Content-Type","Application/json");
			//httpRequest.body(jse.toJSONString());
			Response resp=httpRequest.body("{
				 "id": 9219734994001406000
				}");
				//Response resp=httpRequest.post(); //Sending Post Request
				System.out.println("Response Code is =>  " + resp.getStatusCode());
				//String str=resp.jsonPath().get("SuccessCode"); //Validating Response
				//System.out.println(str);
				//Assert.assertEquals("Correct Status Code shown",str,"Text");
	}

}
