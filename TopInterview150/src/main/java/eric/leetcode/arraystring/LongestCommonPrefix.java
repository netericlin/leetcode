package eric.leetcode.arraystring;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String baseString = strs[0];
        for (int i = 0; i < baseString.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                String compareString = strs[j];
                if (compareString.length() < i + 1) {
                    return sb.toString();
                }
                if (compareString.charAt(i) != baseString.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
