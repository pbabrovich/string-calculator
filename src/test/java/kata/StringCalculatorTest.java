package kata;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    static StringCalculator stringCalculator;

    @BeforeAll
    static void setUp() {
        stringCalculator = new StringCalculator();
        System.out.println("Preparing tests");
    }

    @Test
    void testAdd() {
        assertEquals(0, stringCalculator.add("0"));
    }
}