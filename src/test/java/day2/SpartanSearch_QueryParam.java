package day2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.is;

public class SpartanSearch_QueryParam {

    @BeforeAll
    public static void setUp(){
        baseURI="http://52.91.160.166:8000";
        basePath="/api";
    }

    @Test
    public void testSearch(){
        given()
                .log().all()
                .queryParam("gender","male")
                .queryParam("nameContains","ea").

        when()
                .get("/spartans/search").
         then()
                .log().all()
               .statusCode(200)
                .body("numberOfElements",is(3));
    }

}
