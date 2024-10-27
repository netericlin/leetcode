package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandyTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        Candy solution = new Candy();

        assertEquals(5, solution.candy(new int[]{1, 0, 2}));
        assertEquals(4, solution.candy(new int[]{1, 2, 2}));
    }
}
