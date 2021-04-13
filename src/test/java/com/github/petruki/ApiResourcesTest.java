package com.github.petruki;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ApiResourcesTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/check")
          .then()
             .statusCode(200)
             .body(containsString("All good"));
    }

}