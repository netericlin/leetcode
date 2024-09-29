package eric.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBitsTest {
    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        ReverseBits reverseBits = new ReverseBits();

        // The prefix 0b is used to indicate that a number is written in binary (base 2) format. It is a common notation
        // in several programming languages, including Python and Java (as of version 7). The 0b prefix tells the compiler
        // or interpreter that the following digits represent a binary number, where each digit is either 0 or 1.
        assertEquals(0b00111001011110000010100101000000, reverseBits.reverseBits(0b00000010100101000001111010011100));
        assertEquals(0b10111111111111111111111111111111, reverseBits.reverseBits(0b11111111111111111111111111111101));
    }
}
