package eric.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberIITest {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        SingleNumberII solution = new SingleNumberII();

        assertEquals(3, solution.singleNumber(new int[]{2, 2, 3, 2}));
        assertEquals(99, solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}
