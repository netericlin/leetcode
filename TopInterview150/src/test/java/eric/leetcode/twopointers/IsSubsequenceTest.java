package eric.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {
        IsSubsequence solution = new IsSubsequence();

        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}
