package resreqAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetSingleUser {
	
	
	@Test
	public void testSingleUser() {
		
		RestAssured.baseURI ="https://reqres.in/";
		
		Response res=RestAssured.given().
		header("content-type","application/json").
		when().get("api/users/2").
		then().assertThat().statusCode(200).and().log().all().extract().response();
		
		String response=res.asString();
		
		JsonPath js = new JsonPath(response);
		int id = js.get("data.id");
		String email =js.get("data.email");
		System.out.println("Id is -->"+id+ "   Email Is -->"+email);
		
	
	}

}
