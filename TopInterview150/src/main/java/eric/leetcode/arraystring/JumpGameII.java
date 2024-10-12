package eric.leetcode.arraystring;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++; // Increment the number of jumps
                currentEnd = farthest; // Set the new range to farthest we can reach
            }
        }
        return jumps;
    }
}
