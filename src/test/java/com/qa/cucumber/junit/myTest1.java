package com.qa.cucumber.junit;

import io.restassured.RestAssured;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class myTest1 {

    @BeforeClass
    public static void init() {
        RestAssured.baseURI="https://reqres.in/";


    }


    @Test
    public void get_pass(){

        SerenityRest.given()
                .when()
                .get("api/users")
                .then()
                .log().all()
                .statusCode(200);

    }
    @Test
    public void get_fail(){

        SerenityRest.given()
                .when()
                .get("api/users")
                .then()
                .log().all()
                .statusCode(500);

    }
}
