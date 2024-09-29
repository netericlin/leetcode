package eric.leetcode.bitmanipulation;

public class Numberof1Bits {
    public int hammingWeight(int n) {
        int result = 0;
        while (n > 0) {
            result += (n & 1);
            n = n >> 1;
        }
        return result;
    }
}
