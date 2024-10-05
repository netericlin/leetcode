package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, Arrays.copyOf(nums, 5));

        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        assertEquals(7, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, Arrays.copyOf(nums, 7));
    }
}
