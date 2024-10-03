package eric.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        ContainerWithMostWater solution = new ContainerWithMostWater();

        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }
}
