package day2;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Spartan_Test2 {

    @BeforeAll
    public static void setUp(){
        baseURI="http://52.91.160.166:8000";
        basePath="/api";
    }

    @DisplayName("Get 1 Spartan Test")
    @Test
    public void SingleSpartan(){
          given()
                  .log().uri().
        when()
                .get("/spartans/125")
               // .prettyPeek()
        .

        then()
                .statusCode(is(200))
                //.log().all()
          ;
    }

    @DisplayName("Tesint /Hello again")
    @Test
    public void testHello(){

        given()
                .accept(ContentType.TEXT).

        when()
                .get("/hello").
        then()
                .statusCode(is(200))
                .contentType(ContentType.TEXT)
                .body(equalTo("Hello from Sparta"))
                ;

    }



    @DisplayName("Gel All Spartan")
    @Test
    public void testAllSpartans(){

        given()
                .header("Accept","application/json").
        when()
                .get("spartans").

         then()
                .statusCode(is(200));
    }


    @DisplayName("Gel All Spartan 2")
    @Test
    public void testAllSpartans2(){

        given()

                .accept(ContentType.JSON).
         when()
               .get("/spartans").
          then()
                .statusCode(is(200))
                .contentType(ContentType.JSON);

    }
}
