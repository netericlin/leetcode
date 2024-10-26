package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        IntegerToRoman solution = new IntegerToRoman();

        assertEquals("MMMDCCXLIX", solution.intToRoman(3749));
        assertEquals("LVIII", solution.intToRoman(58));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}
