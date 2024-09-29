package eric.leetcode.bitmanipulation;

public class AddBinary {

    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (aLength > 0 || bLength > 0) {
            int aValue = (aLength > 0) ? a.charAt(--aLength) - '0' : 0;
            int bValue = (bLength > 0) ? b.charAt(--bLength) - '0' : 0;
            int sum = aValue ^ bValue ^ carry;
            carry = aValue & bValue | aValue & carry | bValue & carry;
            sb.append(sum);
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}

