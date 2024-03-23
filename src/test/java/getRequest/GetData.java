package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	public GetData() {
		
	}
	@Test
	public void testResponse() {
		//RestAssured.baseURI="api.openweathermap.org";
		Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=ee6fc3dbb4d8d4c8bf7bd60febe17ead");
		String data = resp.asString();
		int code= resp.getStatusCode();
		System.out.println("Status: "+code);
		System.out.println("data: "+data);
		Assert.assertEquals(code, 200);
		
	}

}
