package eric.leetcode.bitmanipulation;

public class ReverseBits {

    public int reverseBits(int n) {
        int times = 32;
        int value = 0;
        while (times-- > 0) {
            value = (value << 1) + (n & 1);
            n = n >> 1;
        }
        return value;
    }
}
