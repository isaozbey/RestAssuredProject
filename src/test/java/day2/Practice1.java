package day2;


import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.*;

public class Practice1 {
    @DisplayName("Getting All characters Simple Test")
    @Test
    public void TestBreakingBad(){


        when()
                .get("https://www.breakingbadapi.com/api/characters")
                .prettyPeek().
        then()
                .statusCode(Matchers.is(200))
                 .header("Content-Type",is("application/json; charset=utf-8"));
    }


}
