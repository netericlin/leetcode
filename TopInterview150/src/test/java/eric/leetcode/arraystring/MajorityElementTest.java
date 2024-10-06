package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        MajorityElement solution = new MajorityElement();

        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(5, solution.majorityElement(new int[]{6, 5, 5}));
    }
}
