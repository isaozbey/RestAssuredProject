package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class ZipCode_Test {

    @BeforeAll
    public static void setUp(){
        baseURI="http://api.zippopotam.us";
        basePath="/us";
    }

    @DisplayName("Zip to City Test")
    @Test
    public void testZipToCity(){

        given()
                .log().all()
                .pathParam("zipcode",44512).
         when()
               .get("/{zipcode}").

          then()
                .log().all()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("country",is("United States"))
                .body("'post code'",is("44512"));
    }

    @DisplayName("City to Zip")
    @Test
    public void testCityToZip(){
        given()
                .pathParam("state","OH")
                .pathParam("city","Youngstown").
        when()
               .get("{state}/{city}").
        then()
              .log().all()
              .statusCode(is(200))
              .body("'country abbreviation'",is("US"))
              .body("places[0].'place name'",is("Youngstown"));
    }
}
