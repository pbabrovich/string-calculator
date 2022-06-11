package kata;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    static StringCalculator stringCalc;
    @BeforeAll
    static void setUp() {
        stringCalc = new StringCalculator();
        System.out.println("Preparing tests ...");
    }
    @Test
    void emptyStringShouldReturnZero() {
        assertEquals(0, stringCalc.add(" "));
    }
    @Test
    void twoPlusTwoShouldEqualsFour() {
        assertEquals(4, stringCalc.add("2,2"));
    }
    @Test
    void fiveShouldEqualsFive() {
        assertEquals(5, stringCalc.add("5"));
    }
    @Test
    void fivePLusFivePlusTwoPlusTwoShouldEqualsFourteen() {
        assertEquals(14, stringCalc.add("5,5,2,2"));
    }
    @Test
    void testingNewLineAsADelimiter() {
        assertEquals(19, stringCalc.add("5\n5,2,2\n5"));
    }
    @Test
    void hyphenAsACustomDelimiter() {
        assertEquals(14, stringCalc.add("//-\n5-5-2-2"));
    }
    @Test
    void hashAsACustomDelimiter() {
        assertEquals(17, stringCalc.add("//#\n1#3#3#10"));
    }
    @Test
    void QuestionMarkAsACustomDelimiter() {
        assertEquals(17, stringCalc.add("//?\n1?3?3?10"));
    }
}