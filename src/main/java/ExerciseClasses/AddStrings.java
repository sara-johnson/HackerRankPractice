package ExerciseClasses;

/**
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * <p>
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * https://leetcode.com/problems/add-strings/
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();

        int str1Pointer = num1.length() - 1;
        int str2Pointer = num2.length() - 1;

        int carry = 0;
        while (str1Pointer >= 0 || str2Pointer >= 0) {
            int x1;
            int x2;
            int value;

            x1 = str1Pointer >= 0 ? num1.charAt(str1Pointer) - '0' : 0;
            x2 = str2Pointer >= 0 ? num2.charAt(str2Pointer) - '0' : 0;

            value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;

            result.append(value);

            str1Pointer--;
            str2Pointer--;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
