package Day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    public void calculatorTest(){

        assertEquals(9,4+5);

    }


    @DisplayName("I am tetsing the name")
    @Test
    public void nameTest(){

        String first="Isa";
        String last=" Ozbey";
        String fullName="Isa Ozbey";

        assertEquals(fullName,first+last);

    }
}
