package eric.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddBinaryTest {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        AddBinary addBinary = new AddBinary();

        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }
}
