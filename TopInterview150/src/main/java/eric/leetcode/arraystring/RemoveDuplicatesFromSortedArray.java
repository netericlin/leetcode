package eric.leetcode.arraystring;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        int pre = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num != pre) {
                pre = num;
                nums[pointer++] = num;
            }
        }
        return pointer;
    }
}
