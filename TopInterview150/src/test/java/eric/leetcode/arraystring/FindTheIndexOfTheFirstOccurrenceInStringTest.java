package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOfTheFirstOccurrenceInStringTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        FindTheIndexOfTheFirstOccurrenceInString solution = new FindTheIndexOfTheFirstOccurrenceInString();

        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}
