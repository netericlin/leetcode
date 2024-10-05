package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOf(nums, 2));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.copyOf(nums, 5));
    }
}
