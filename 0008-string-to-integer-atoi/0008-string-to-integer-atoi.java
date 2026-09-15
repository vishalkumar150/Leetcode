class Solution {

    public int myAtoi(String s) {

        int index = 0;

        // Skip leading spaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Check sign
        int sign = 1;

        if (index < s.length() && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        else if (index < s.length() && s.charAt(index) == '+') {
            index++;
        }

        // Recursively convert digits
        return convert(s, index, 0, sign);
    }

    private int convert(String s, int index, int result, int sign) {

        // Stop if end of string or current character is not a digit
        if (index == s.length() ||
            s.charAt(index) < '0' ||
            s.charAt(index) > '9') {

            return result * sign;
        }

        // Convert character into digit
        int digit = s.charAt(index) - '0';

        // Check overflow
        if (result > (Integer.MAX_VALUE - digit) / 10) {

            if (sign == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }

        // Build the number
        result = result * 10 + digit;

        // Recursive call
        return convert(s, index + 1, result, sign);
    }
}