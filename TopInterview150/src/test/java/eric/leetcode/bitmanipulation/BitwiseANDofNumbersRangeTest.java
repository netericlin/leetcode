package eric.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseANDofNumbersRangeTest {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        BitwiseANDofNumbersRange solution = new BitwiseANDofNumbersRange();

        assertEquals(4, solution.rangeBitwiseAnd(5, 7));
        assertEquals(0, solution.rangeBitwiseAnd(0, 0));
        assertEquals(0, solution.rangeBitwiseAnd(1, 2147483647));
    }
}
