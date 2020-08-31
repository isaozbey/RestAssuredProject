package Day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAfter_in_JUnit5 {


    @BeforeAll
    public static void SetUp(){
        System.out.println("This run before All");
    }
    @Test
    public void test1(){
        System.out.println("Test1 is running");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is running");
    }
    @AfterAll
    public static void TearDown(){
        System.out.println("This run all the way at the end");
    }

}
