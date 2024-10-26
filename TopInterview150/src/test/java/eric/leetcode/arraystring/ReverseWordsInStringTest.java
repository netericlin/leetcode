package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInStringTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        ReverseWordsInString solution = new ReverseWordsInString();

        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
        assertEquals("world hello", solution.reverseWords("  hello world  "));
    }
}
