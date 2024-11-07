package pojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserTest {

//Serialization :- We pass the newUser object to .body(newUser); Rest Assured automatically serializes this Java object into JSON.	
	@Test
	public void createNewUserJSONFromUserPOJOClass() throws JsonProcessingException {

		// Create a new User object
		User newUser = new User(1, "John Doe", "john.doe@example.com");

		ObjectMapper objectMap = new ObjectMapper(); // Jackson jar
		String newUserJson = objectMap.writerWithDefaultPrettyPrinter().writeValueAsString(newUser);
		System.out.println("Json Object from Java POJO --->>>>" + newUserJson);

		// Jackson Jar are important to serialization and desearilization

		// Setting base URI (the base URL for the API)
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Example API

		// Send GET request and map the response to the User POJO
		Response response = given()
				.header("content-type", ContentType.JSON)	
				.body(newUser) 
				.when().post("/users").then().assertThat().statusCode(201).and().log().all().extract().response();

		// Printing the user object to verify mapping
		System.out.println("Response --->" + response.asString());

	}
	
	@Test
	public void getPojoFromUserObject() throws JsonProcessingException
	{
		// Just create an object of Pojo class
		User newUser = new User(1, "John Doe", "john.doe@example.com");
		// Set value as you wish
		
		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String userJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newUser);
		
		System.out.println("String/POJO Object from JSON --->>>>" + userJson);
		
		// Converting EMployee json string to Employee class object
		User user = objectMapper.readValue(userJson, User.class);
		System.out.println("First Name of User : "+user.getName());
		System.out.println("Email of User : "+user.getEmail());
		System.out.println("Id of employee : "+user.getId());
	}
}
	

