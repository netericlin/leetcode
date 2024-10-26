package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        ZigzagConversion solution = new ZigzagConversion();

        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }
}
