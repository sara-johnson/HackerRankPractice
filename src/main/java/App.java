import AmazonOA.*;
import ExerciseClasses.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//import AmazonOA.SplitStringIntoPrimes;

public class App {
    public static void main(String[] args) {
        System.out.println("LeetCode Practice:");
        System.out.println();


        System.out.println("Problem: CountTeams");
        int numOfAssociates1 = 6;
        int[] skills1 = {12, 4, 6, 12, 5, 10};
        int minAssociates1 = 3;
        int minLevel1 = 4;
        int maxLevel1 = 10;

        System.out.println(CountTeams.countTeams(numOfAssociates1, skills1, minAssociates1, minLevel1, maxLevel1));

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

        System.out.println();

        System.out.println("Problem: Fill The Truck");
        List<Integer> boxes = new ArrayList<>();
        boxes.add(1);
        boxes.add(2);
        boxes.add(3);
        List<Integer> unitsPerBox = new ArrayList<>();
        unitsPerBox.add(3);
        unitsPerBox.add(2);
        unitsPerBox.add(3);

        FillTheTruck truck = new FillTheTruck();
        System.out.println(truck.unitsToFillTheTruck(3,
                boxes, 3, unitsPerBox, 3));

        System.out.println();

        System.out.println("Problem: Smallest Negative Balance");
        SmallestNegativeBalance.DebtRecord rec1 = new SmallestNegativeBalance.DebtRecord("Alex", "Blake", 2);
        SmallestNegativeBalance.DebtRecord rec2 = new SmallestNegativeBalance.DebtRecord("Blake", "Alex", 2);
        SmallestNegativeBalance.DebtRecord rec3 = new SmallestNegativeBalance.DebtRecord("Casey", "Alex", 5);
        SmallestNegativeBalance.DebtRecord rec4 = new SmallestNegativeBalance.DebtRecord("Blake", "Casey", 7);
        SmallestNegativeBalance.DebtRecord rec5 = new SmallestNegativeBalance.DebtRecord("Alex", "Blake", 4);
        SmallestNegativeBalance.DebtRecord rec6 = new SmallestNegativeBalance.DebtRecord("Alex", "Casey", 4);
        List<SmallestNegativeBalance.DebtRecord> recs = new ArrayList<>();
        recs.add(rec1);
        recs.add(rec2);
        recs.add(rec3);
        recs.add(rec4);
        recs.add(rec5);
        recs.add(rec6);

        SmallestNegativeBalance snb = new SmallestNegativeBalance();
        snb.findSmallestNegativeBalance(6, 3, recs);

        System.out.println();

        System.out.println("Problem: Break A Palindrome");
        String str1 = "abccba";
        String str2 = "abccba";
        String str3 = "bdggdb";
        BreakAPalindrome breakPalindrome = new BreakAPalindrome();
        System.out.println(breakPalindrome.breakPalindrome(str2));

        System.out.println();

        System.out.println("Problem: Fetch Items To Display");

        FetchItemsToDisplay.TwoInts twoInts1 = new FetchItemsToDisplay.TwoInts(3, 4);
        FetchItemsToDisplay.TwoInts twoInts2 = new FetchItemsToDisplay.TwoInts(10, 15);
        FetchItemsToDisplay.TwoInts twoInts3 = new FetchItemsToDisplay.TwoInts(17, 8);


        HashMap<String, FetchItemsToDisplay.TwoInts> myMap = new HashMap<String, FetchItemsToDisplay.TwoInts>();
        myMap.put("item2", twoInts1);
        myMap.put("item1", twoInts2);
        myMap.put("item3", twoInts3);

        FetchItemsToDisplay fetchItems = new FetchItemsToDisplay();
        List<String> items = fetchItems.fetchItems(1, 0, 2, 1, 2, myMap);
        System.out.println(items);

        System.out.println();

        System.out.println("Problem: Three Keyword Suggestions");
        int numbreviews = 5;
        List<String> repo = new ArrayList<>(Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad"));
        String query = "mouse";
        threeKeywordSuggestions kwSuggestions = new threeKeywordSuggestions();
        List<List<String>> result = kwSuggestions.keyWordSuggestions(numbreviews, repo, query);
        System.out.println(result);

        System.out.println();

        System.out.println("Problem: LRU Cache Misses");
        int num1 = 6;
        List<Integer> pages1 = new ArrayList<>();
        pages1.add(1);
        pages1.add(2);
        pages1.add(1);
        pages1.add(3);
        pages1.add(1);
        pages1.add(2);
        int maxCacheSize1 = 2;

        LRUCacheMisses lruCacheMisses = new LRUCacheMisses();
        System.out.println(lruCacheMisses.lruCacheMisses(num1, pages1, maxCacheSize1));

        System.out.println();

        System.out.println("Problem: Ways To Split Primes");
        String input1 = "3175";
        int length1 = input1.length();
        System.out.println(SplitStringIntoPrimes.waysToSplitStringIntoPrimes(input1, length1));

        int[][] arr = new int[][]{{1, 2, 3}, {1, 2, 3}};

        System.out.println("----");
        System.out.println(arr[0][0]);
    }


}
