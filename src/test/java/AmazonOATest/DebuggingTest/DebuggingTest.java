package AmazonOATest.DebuggingTest;

import AmazonOA.DebuggingPractice.Debugging;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DebuggingTest {
    private Debugging problems;

    @BeforeEach
    void setup() {
        this.problems = new Debugging();
    }

    /**
     * ------------ Tests for 1. Calculate Sum of Numbers in String ------------
     */
    @Test
    public void calculateSumOfNumbersInString_noDigits() {
        String input = "Warning";
        int expected = 0;
        int result = problems.calculateSumOfNumbersInString(input);
        assertEquals(expected, result);
    }
    @Test
    public void calculateSumOfNumbersInString_endsWithDigit() {
        String input = "Juicy.mp4";
        int expected = 4;
        int result = problems.calculateSumOfNumbersInString(input);
        assertEquals(expected, result);
    }
    @Test
    public void calculateSumOfNumbersInString_startsWithDigits() {
        String input = "16. Unbelievable";
        int expected = 16;
        int result = problems.calculateSumOfNumbersInString(input);
        assertEquals(expected, result);
    }
    @Test
    public void calculateSumOfNumbersInString_mixedDigits() {
        String input = "19. Just Playing - 2005 Remaster.mp4";
        int expected = 2028;
        int result = problems.calculateSumOfNumbersInString(input);
        assertEquals(expected, result);
    }


    /**
     * ------------ Tests for 2. Check Pair Sum Exists ------------
     */
    @Test
    public void checkPairSumExists_onePair() {
        int rows = 2;
        int cols = 2;
        int[][] arr = new int[rows][cols];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        int sum = 5;
        assertTrue(problems.checkPairSumExists(rows, cols, arr, sum));
    }
    @Test
    public void checkPairSumExists_noPairs() {
        int rows = 3;
        int cols = 3;
        int[][] arr = new int[rows][cols];
        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[0][2] = 1;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[2][0] = 1;
        arr[2][1] = 0;
        arr[2][2] = 0;
        int sum = 3;
        assertFalse(problems.checkPairSumExists(rows, cols, arr, sum));
    }
    @Test
    public void checkPairSumExists_oneElement() {
        int rows = 1;
        int cols = 1;
        int[][] arr = new int[rows][cols];
        arr[0][0] = 7;
        int sum = 7;
        assertFalse(problems.checkPairSumExists(rows, cols, arr, sum));
    }


    /**
     * ------------ Tests for 3. Remove Consecutive Vowels ------------
     */
    @Test
    public void removeConsecutiveVowels_noVowels() {
        String input = "psssst!";
        String expected = "psssst!";
        String result = problems.removeConsecutiveVowels(input);
        assertEquals(expected, result);
    }
    @Test
    public void removeConsecutiveVowels_removesVowels() {
        String input = "school";
        String expected = "schol";
        String result = problems.removeConsecutiveVowels(input);
        assertEquals(expected, result);
    }
    @Test
    public void removeConsecutiveVowels_allVowels() {
        String input = "aeiou";
        String expected = "a";
        String result = problems.removeConsecutiveVowels(input);
        assertEquals(expected, result);
    }
    @Test
    public void removeConsecutiveVowels_startsWithConsecutiveVowels() {
        String input = "aardvark";
        String expected = "ardvark";
        String result = problems.removeConsecutiveVowels(input);
        assertEquals(expected, result);
    }
    @Test
    public void removeConsecutiveVowels_endsWithConsecutiveVowels() {
        String input = "matinee";
        String expected = "matine";
        String result = problems.removeConsecutiveVowels(input);
        assertEquals(expected, result);
    }


    /**
     * ------------ Tests for 4. Reverse Alphabet Chars Only ------------
     */
    @Test
    public void reverseAlphabetCharsOnly_reversesAlphaString() {
        String input = "Hi";
        String expected = "iH";
        String result = problems.reverseAlphabetCharsOnly(input);
        assertEquals(expected, result);
    }
    @Test
    public void reverseAlphabetCharsOnly_notReversesNumbers() {
        String input = "123";
        String expected = "123";
        String result = problems.reverseAlphabetCharsOnly(input);
        assertEquals(expected, result);
    }
    @Test
    public void reverseAlphabetCharsOnly_notReversesSymbols() {
        String input = "$-^&/";
        String expected = "$-^&/";
        String result = problems.reverseAlphabetCharsOnly(input);
        assertEquals(expected, result);
    }
    @Test
    public void reverseAlphabetCharsOnly_reversesOnlyLettersInMixedString() {
        String input = "abcdabc!";
        String expected = "cbadcba!";
        String result = problems.reverseAlphabetCharsOnly(input);
        assertEquals(expected, result);
    }
    @Test
    public void reverseAlphabetCharsOnly_reversesOnlyLettersInMixedString2() {
        String input = "a,b$c";
        String expected = "c,b$a";
        String result = problems.reverseAlphabetCharsOnly(input);
        assertEquals(expected, result);
    }
    @Test
    public void reverseAlphabetCharsOnly_reversesOnlyLettersInMixedString3() {
        String input = "Ab,c,de!$";
        String expected = "ed,c,bA!$";
        String result = problems.reverseAlphabetCharsOnly(input);
        assertEquals(expected, result);
    }


    /**
     * ------------ Tests for 5. Compare Product ------------
     */
    @Test
    public void compareProducts_happyCase() {
        int input = 2841;
        assertTrue(problems.compareProduct(input));
    }
    @Test
    public void compareProducts_happyCase2() {
        int input = 12112;
        assertTrue(problems.compareProduct(input));
    }
    @Test
    public void compareProducts_failingCase() {
        int input = 4324;
        assertFalse(problems.compareProduct(input));
    }
    @Test
    public void compareProducts_failingCase2() {
        int input = 23231;
        assertFalse(problems.compareProduct(input));
    }
    @Test
    public void compareProducts_failingCase3() {
        int input = 1;
        assertFalse(problems.compareProduct(input));
    }


    /**
     * ------------ Tests for 6. Count Triplet Sum Permutations ------------
     */
    @Test
    public void countTripletSumPermutations1() {
        int size = 5;
        int[] arr = new int[] {0, -1, 2, -3, 1};
        int tripletSum = -1;
        assertEquals(1, problems.countTripletSumPermutations(size, arr, tripletSum));
    }
    @Test
    public void countTripletSumPermutations2() {
        int size = 3;
        int[] arr = new int[] {1, 2, 3};
        int tripletSum = 5;
        assertEquals(0, problems.countTripletSumPermutations(size, arr, tripletSum));
    }
    @Test
    public void countTripletSumPermutations3() {
        int size = 3;
        int[] arr = new int[] {1, 2, 3};
        int tripletSum = 6;
        assertEquals(1, problems.countTripletSumPermutations(size, arr, tripletSum));
    }
    @Test
    public void countTripletSumPermutations4() {
        int size = 5;
        int[] arr = new int[] {1, -2, 1, 0, 5};
        int tripletSum = 0;
        assertEquals(1, problems.countTripletSumPermutations(size, arr, tripletSum));
    }
    @Test
    public void countTripletSumPermutations5() {
        int size = 5;
        int[] arr = new int[]{1, 2, 3, 4, 1};
        int tripletSum = 4;
        assertEquals(1, problems.countTripletSumPermutations(size, arr, tripletSum));
    }
    @Test
    public void countTripletSumPermutations7() {
        int size = 4;
        int[] arr = new int[]{1, 2, 3, 1, 2};
        int tripletSum = 5;
        assertEquals(1, problems.countTripletSumPermutations(size, arr, tripletSum));
    }
}
