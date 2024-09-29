package eric.leetcode.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String value = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(value.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(value.charAt(right))) {
                right--;
            }
            else {
                if (value.charAt(left++) != value.charAt(right--)) {
                    return false;
                }
            }
        }
        return true;
    }

}
