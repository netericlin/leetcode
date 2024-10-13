package eric.leetcode.arraystring;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations); //ascending
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[n - 1 - i] < i + 1) {
                return i;
            }
        }
        return n;
    }
}
