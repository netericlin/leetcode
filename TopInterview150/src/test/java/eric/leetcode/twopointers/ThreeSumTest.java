package eric.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        ThreeSum solution = new ThreeSum();

        assertEquals(Arrays.asList(List.of(-1, -1, 2), List.of(-1, 0, 1)),
                     solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(Collections.EMPTY_LIST, solution.threeSum(new int[]{0, 1, 1}));
        assertEquals(List.of(List.of(0, 0, 0)), solution.threeSum(new int[]{0, 0, 0}));
    }
}
