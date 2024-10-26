package eric.leetcode.arraystring;

import java.util.Arrays;

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuffer[] rows = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuffer();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (Character c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        return Arrays.stream(rows).map(StringBuffer::toString)
                .reduce("", (a, b) -> a + b);

    }
}
