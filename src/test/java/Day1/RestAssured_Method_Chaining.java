package Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class RestAssured_Method_Chaining {

    @DisplayName("First Attempt for chaining")
    @Test
    public void chainingMethod_Test1(){

//"http://52.91.160.166:8000/api/hello"

        when().get("http://52.91.160.166:8000/api/hello").then().statusCode(200);



    }


    @DisplayName("Using Hmacrest matcheer for asssertion")
    @Test
    public void testingWithMatcher(){
        when().get("http://52.91.160.166:8000/api/hello").prettyPeek().
                then().statusCode(200).header("Content-Length","17").
                header("Content-Type", Matchers.equalTo("text/plain;charset=UTF-8")).
                body(Matchers.is("Hello from Sparta"));
    }


    @DisplayName("Testing Get/api/Spartans endpoint")
    @Test
    public void testAllSpartans(){

        given().
                header("Accept","application/xml").

        when().get("http://52.91.160.166:8000/api/spartans").prettyPeek().
        then().
           statusCode(Matchers.is(200))  ;
    }
}
