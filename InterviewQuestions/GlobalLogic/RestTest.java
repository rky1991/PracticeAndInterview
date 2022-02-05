package GlobalLogic;

import org.seleniumhq.jetty9.server.Response;

public class RestTest {
	
	
	
	public void testPhonNo() {
		
		RestAssured.BaseURI="";
		
		Response res=given().header("contenType").Body(" json file ").
		when().Post("resources").
		then().assetThat().status(201).extract();
		
	}

}
