package eric.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Numberof1BitsTest {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        Numberof1Bits solution = new Numberof1Bits();

        assertEquals(3, solution.hammingWeight(11));
        assertEquals(1, solution.hammingWeight(128));
        assertEquals(30, solution.hammingWeight(2147483645));

    }

}
