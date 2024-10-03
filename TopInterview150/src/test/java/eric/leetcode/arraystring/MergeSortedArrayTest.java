package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class MergeSortedArrayTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        MergeSortedArray solution = new MergeSortedArray();

        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(num1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, num1);

        num1 = new int[]{1};
        solution.merge(num1, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, num1);

        num1 = new int[]{0};
        solution.merge(num1, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, num1);
    }
}
