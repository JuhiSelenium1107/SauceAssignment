package com.api.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class VerifyResponseCode {
	
	@Test
	public void verifyStatusCode()
	{
		int code=RestAssured.get("https://reqres.in/api/users/").statusCode();
		Assert.assertEquals(200, code);
		//System.out.println(code);
	}

}
