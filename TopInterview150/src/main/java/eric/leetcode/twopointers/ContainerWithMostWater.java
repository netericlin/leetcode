package eric.leetcode.twopointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int tmpArea;
            if (height[left] < height[right]) {
                tmpArea = (right - left) * height[left];
                left++;
            }
            else {
                tmpArea = (right - left) * height[right];
                right--;
            }
            maxArea = Math.max(maxArea, tmpArea);
        }
        return maxArea;
    }
}
