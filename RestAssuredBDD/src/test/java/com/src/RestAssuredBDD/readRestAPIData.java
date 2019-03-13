package com.src.RestAssuredBDD;

import static io.restassured.RestAssured.given;
import io.restassured.*;
import static org.hamcrest.Matchers.hasSize;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class readRestAPIData {
	public static RequestSpecification request;
	//public static ResponseOptions<Response> response;
	@Test
	public void test_main_data() throws URISyntaxException, MalformedURLException{
		/*
		String url = "https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1";
		given().
		
		when().
		get(url).
		then().
		assertThat().
		statusCode(200).
		
		and().
		body("list.main.temp", hasSize(3));
		
		Response resp = RestAssured.get(url);
		int code = resp.getStatusCode();
		String bodyContent = resp.asString();
		System.out.println("code :"+code);
		System.out.println("body :"+bodyContent);
		*/
		///*
		String url = "https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1";
		//String url = "https://pokeapi.co/api/v2/pokemon/1/";
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(url);
		builder.setContentType(ContentType.JSON);
		RequestSpecification requestSpec = builder.build();
		//RequestSpecification requestSpec = builder.build();
		request = RestAssured.given().spec(requestSpec);
		Response response = request.get(url);
		//String content = finalContent.getBody();
		//String ram = content.get();
		response.getStatusCode();
		String content = response.getBody().jsonPath().get("cod");
		System.out.println("Response :" +response.getStatusCode());
		System.out.println("Response :" +content);
		//*/
	}

}
