import ExerciseClasses.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("LeetCode Practice:");
        System.out.println();

        System.out.println("Problem: Keyword Suggestions");
        String[] myProducts1 = new String[]{"bags", "baggage", "banner", "box", "cloths"};
        String myWord1 = "bags";

        String[] myProducts2 = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String myWord2 = "mouse";

        KeywordSuggestions suggestions = new KeywordSuggestions();
        System.out.println(suggestions.suggestedProducts(myProducts2, myWord2));
        System.out.println();

        System.out.println("Problem: Two Sum");
        int[] arr1 = new int[]{2, 7, 11, 15};
        int target1 = 9;

        int[] arr2 = new int[]{3, 2, 4};
        int target2 = 6;

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(arr2, target2)));
        System.out.println();

        System.out.println("Problem: Slowest Key Press");
        int[] releaseTimes1 = {9, 29, 49, 50};
        String keysPressed1 = "cbcd";

        int[] releaseTimes2 = {12, 23, 36, 46, 62};
        String keysPressed2 = "spuda";

        int[] releaseTimes3 = {23, 34, 43, 59, 62, 80, 83, 92, 97};
        String keysPressed3 = "qgkzzihfc";

        SlowestKeyPress slowestKeyPress = new SlowestKeyPress();
        System.out.println(slowestKeyPress.slowestKey(releaseTimes3, keysPressed3));
        System.out.println();

        System.out.println("Problem: Add Strings");
        String five = "5";
        String two = "2";

        AddStrings addStrings = new AddStrings();
        System.out.println(addStrings.addStrings(five, two));
        System.out.println();

        System.out.println("Problem: FizzBuzz");
        int fifteen = 15;
        int sixtySeven = 67;
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(fifteen));
        System.out.println();

        System.out.println("Problem: Valid Palindrome");
        String palindrome1 = "race a car"; //false
        String palindrome2 = "A man, a plan, a canal: Panama"; //true
        String palindrome3 = ""; //true
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome(palindrome2));
    }
}
