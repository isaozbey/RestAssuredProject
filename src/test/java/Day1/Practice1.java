package Day1;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Practice1 {

//http://52.91.160.166:8000/api/hello

    @Test
    public void test1(){


        Response response= RestAssured.get("http://52.91.160.166:8000/api/hello");
        System.out.println("Status Code:  = " + response.statusCode());

        System.out.println("Status Line of Response = " + response.statusLine());

        System.out.println("Header==="+response.header("date"));
        System.out.println("Content-Type===="+response.getHeader("content-type"));



    }
    @DisplayName(("testing Hello Endpoint"))
    @Test
    public void testHello(){
        Response response= RestAssured.get("http://52.91.160.166:8000/api/hello");

        assertEquals(200,response.statusCode());
    }

    @DisplayName("Testing /Hello endpoint body")
    @Test
    public void TestingHelloResponseBody(){
        Response response= RestAssured.get("http://52.91.160.166:8000/api/hello");
        System.out.println("response.asString() = " + response.asString());

        System.out.println("response.body() = " + response.body().asString());

        assertEquals("Hello from Sparta", response.asString());
        assertEquals(17, response.asString().length());

    }


    @DisplayName("Printing th response body using method")
    @Test
    public void printingBody(){
        Response response= RestAssured.get("http://52.91.160.166:8000/api/hello");
        response.prettyPrint();
        response.prettyPeek().statusCode();
    }




}
