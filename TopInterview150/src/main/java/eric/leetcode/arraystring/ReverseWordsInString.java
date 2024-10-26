package eric.leetcode.arraystring;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (word.isEmpty()) {
                    continue;
                }
                words.addFirst(word.toString());
                word = new StringBuilder();
            }
            else {
                word.append(c);
            }
        }
        if (!word.isEmpty()) {
            words.addFirst(word.toString());
        }
        return String.join(" ", words);
    }
}
