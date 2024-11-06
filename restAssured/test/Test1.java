package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
	
	@Test
	public void test22() {
		 // Define the base URL of the API
        String baseUrl = "https://jsonplaceholder.typicode.com";

        // Send GET request to the API endpoint and get the response
        Response response = RestAssured.given()
                                       .baseUri(baseUrl)
                                       .when()
                                       .get("/users/1").
                                       then().assertThat().statusCode(200).and().log().all().extract().response();

        // Check if the response status code is 200
        Assert.assertEquals(response.statusCode(), 200);

        // Extract specific value from JSON response (e.g., name field)
        String name = response.jsonPath().getString("name");

        // Print the extracted value
        System.out.println("Extracted name: " + name);

        // Optionally, you can also extract other values, e.g., email, city, etc.
        String email = response.jsonPath().getString("email");
        System.out.println("Extracted email: " + email);
		
	}

}
