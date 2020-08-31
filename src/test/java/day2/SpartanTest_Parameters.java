package day2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SpartanTest_Parameters {


    @BeforeAll
    public static void setUp(){
        baseURI="http://52.91.160.166:8000";
        basePath="/api";
    }
    @DisplayName("Testing /Spartans/{id}")
    @Test
    public void testingSingleSpartan(){

        given()
                .log().all()
                .pathParam("id",127).

         when()
                .get("spartans/{id}").
          then()
                .statusCode(is(200))
                .log().all()
                .body("id",is(127))
                .body("name",is("Helen"))
                .body("gender",is("Female"))
                .body("phone",is(12345678990L));

    }


}
