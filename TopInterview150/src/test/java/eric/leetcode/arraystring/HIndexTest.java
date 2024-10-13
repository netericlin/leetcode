package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        HIndex solution = new HIndex();

        assertEquals(3, solution.hIndex(new int[]{3, 0, 6, 1, 5}));
        assertEquals(1, solution.hIndex(new int[]{1, 3, 1}));
    }
}
