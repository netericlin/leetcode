package eric.leetcode.arraystring;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int swap = length - ((k + length) % length);
        swap(nums, 0, swap - 1);
        swap(nums, swap, length - 1);
        swap(nums, 0, length - 1);
    }

    private void swap(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
