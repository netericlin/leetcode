package eric.leetcode.arraystring;

public class FindTheIndexOfTheFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0) {
            return 0;
        }
        if (haystackLength < needleLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
