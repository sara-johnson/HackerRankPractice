package ExerciseClasses;

/**
 * Given a string, determine if it is a palindrome, considering
 * only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as
 * valid palindrome.
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        String lowerCase = s.toLowerCase();

        int counter = 0;
        for (int i = lowerCase.length() - 1; i > 0; ) {
            if (!Character.isLetterOrDigit((lowerCase.charAt(i)))) {
                i--;
                continue;
            }
            if (!Character.isLetterOrDigit((lowerCase.charAt(counter)))) {
                counter++;
                continue;
            }

            if (lowerCase.charAt(i) != lowerCase.charAt(counter)) {
                return false;
            }
            i--;
            counter++;
        }
        
        return true;
    }
}
