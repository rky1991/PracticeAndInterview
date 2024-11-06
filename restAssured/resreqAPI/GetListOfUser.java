package resreqAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetListOfUser {
	
	@Test
	public void getListOfUser() {
		
		// Base URI
		RestAssured.baseURI="https://reqres.in/";
		
		
		// Rest Assured Code in Given , when , then
		Response res = RestAssured.given().header("content-type","application/json").
		         when().
		         get("/api/users?page=2").
		         then().assertThat().statusCode(200).and().log().all().extract().response();
		
		
		// One Way to Get Email From Response
		String email=res.jsonPath().get("data[1].email");	
		System.out.println("Email Value of first set -->"+email);
	
		//Second Way to Get the value -->
		String response=res.asString();
		System.out.println("Response As String "+response);
		JsonPath js = new JsonPath(response);
		String emailValue=js.get("data[2].email");
		System.out.println("Email Value of second set -->"+email);
		
		//Using Json Path reference we can get any attribute value;
		
		int id=js.get("data[1].id");
		System.out.println("Id from Json Response "+id);
		
	}

}
