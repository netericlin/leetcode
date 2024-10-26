package eric.leetcode.arraystring;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean escapeSpace = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isWhitespace(s.charAt(i))) {
                if (escapeSpace) {
                    continue;
                }
                else {
                    return len;
                }
            }
            escapeSpace = false;
            len++;
        }
        return len;
    }
}
