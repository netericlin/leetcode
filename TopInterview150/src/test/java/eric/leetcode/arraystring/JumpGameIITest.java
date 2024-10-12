package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGameIITest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        JumpGameII solution = new JumpGameII();

        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 3, 0, 1, 4}));
    }
}
