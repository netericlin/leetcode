package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        RemoveElement solution = new RemoveElement();

        int[] nums = new int[]{3, 2, 2, 3};
        assertEquals(2, solution.removeElement(nums, 3));
        assertArrayEquals(new int[]{2, 2}, Arrays.copyOf(nums, 2));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, solution.removeElement(nums, 2));
        assertArrayEquals(new int[]{0, 1, 3, 0, 4}, Arrays.copyOf(nums, 5));
    }
}
