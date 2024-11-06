package resreqAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {
	
	
	@Test
	public void testPostMethod() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		Response res =RestAssured.given().
		header("content-type","application/json").
		body("{\r\n"
				+ "    \"name\": \"Rahul\",\r\n"
				+ "    \"job\": \"Consultant\"\r\n"
				+ "}").
		when().post("api/users").
		then().assertThat().statusCode(201).and().log().all().extract().response();
		
		String response = res.asString();
		
		System.out.println("Post Request Reponse -->>"+response);
	
	}

}
