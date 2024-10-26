package eric.leetcode.arraystring;

import java.util.Map;

public class RomanToInteger {
    Map<Character, Integer> map = Map.of('I', 1,
                                         'V', 5,
                                         'X', 10,
                                         'L', 50,
                                         'C', 100,
                                         'D', 500,
                                         'M', 1000);

    public int romanToInt(String s) {
        int total = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int val = map.get(s.charAt(i));
            int valNext = (i + 1 >= len) ? 0 : map.get(s.charAt(i + 1));
            if (val >= valNext) {
                total += val;
            }
            else {
                total -= val;
            }
        }
        return total;
    }
}
