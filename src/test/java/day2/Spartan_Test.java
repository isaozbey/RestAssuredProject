package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Spartan_Test {






    @DisplayName("Gel All Spartan")
    @Test
    public void testAllSpartans(){

        //String  spartanURl="http://52.91.160.166:8000/api/spartans";
        baseURI="http://52.91.160.166:8000";
        basePath="/api";

        given()
                .header("Accepp","application/json").
        when()
                .get("spartans").

         then()
                .statusCode(is(200));
    }


    @DisplayName("Gel All Spartan 2")
    @Test
    public void testAllSpartans2(){

        given()
                .baseUri("http://52.91.160.166:8000")
                .basePath("api")
                //.accept("application/json")
                .accept(ContentType.JSON).
         when()
               .get("/spartans").
          then()
                .statusCode(is(200))
                //.contentType("application/json;charset=UTF-8")
                .contentType(ContentType.JSON);

    }
}
