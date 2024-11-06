package test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChatGPTPostRequest {
	
	    @Test
	    public void createUserAndExtractId() {
	        // Base URI of the API (JSONPlaceholder is a mock API)
	        String baseUrl = "https://jsonplaceholder.typicode.com";

	        // Prepare the request body to create a new user
	        String requestBody = "{\n" +
	                "    \"name\": \"John Doe\",\n" +
	                "    \"username\": \"johndoe\",\n" +
	                "    \"email\": \"john.doe@example.com\"\n" +
	                "}";

	        // Send a POST request to create the user
	        Response response = RestAssured.given()
	                .baseUri(baseUrl)
	                .header("Content-Type", "application/json")
	                .body(requestBody) // Attach the request body
	                .when()
	                .post("/users")// API endpoint to create a user
	                .then().assertThat().statusCode(201).and().log().all().extract().response(); 
	        
	        String res=response.asString();
	        System.out.println("Response of Post Request --->>>"+res);

	        // Assert that the response status code is 201 (Created)
	        Assert.assertEquals(response.statusCode(), 201, "Expected status code is 201");

	        // Extract the ID of the created user from the response
	        int userId = response.jsonPath().getInt("id");

	        // Print the user ID
	        System.out.println("Created user ID: " + userId);

	        // Optionally, you can assert that the ID is a valid number (greater than 0)
	        Assert.assertTrue(userId > 0, "The user ID should be greater than 0");
	    }
	
	

}
