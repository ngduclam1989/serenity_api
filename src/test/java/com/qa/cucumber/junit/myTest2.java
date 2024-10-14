package com.qa.cucumber.junit;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class myTest2 {

    @BeforeClass
    public static void init() {
        RestAssured.baseURI="https://reqres.in/";


    }


    @Test
    public void get_demo(){

        SerenityRest.given()
                .when()
                .get("api/users")
                .then()
                .log().all()
                .statusCode(200);

    }

}
