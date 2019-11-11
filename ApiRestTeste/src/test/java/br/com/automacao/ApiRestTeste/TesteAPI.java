package br.com.automacao.ApiRestTeste;


import static io.restassured.RestAssured.given;

import org.junit.Test;


public class TesteAPI {

	@Test
	public void teste () {
		String uriBase = "https://reqres.in/api/users?page=2";
		given()
			.relaxedHTTPSValidation()
		.when()
			.get(uriBase)
		.then()
			.statusCode(200);
		
	}
}
