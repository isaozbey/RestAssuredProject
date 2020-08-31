package Day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.* ;

import static org.hamcrest.MatcherAssert.assertThat;

public class Practice2 {

    @Test
    public void tet1(){
        int num1=5;
        int num2=4;

        assertThat(num1+num2, is(9));
        assertThat(num1+num2, not(10));
        assertThat(num1+num2, equalTo(9));

        assertThat(num1+num2, is(not(10)));

    }

    @DisplayName("Support Coollection")
    @Test
    public void test2() {
        List<Integer> numList = Arrays.asList(11, 44, 3, 55, 88, 5);
        assertThat(numList,hasSize(6));
        assertThat(numList,hasItem(5));





    }
}
