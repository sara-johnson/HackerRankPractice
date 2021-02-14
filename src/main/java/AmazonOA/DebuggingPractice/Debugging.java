package AmazonOA.DebuggingPractice;


import java.util.HashSet;
import java.util.Set;

/**
 * The following functions compile successfully but fail to return the desired result.
 * Your task is to fix the code so that it passes all test cases.
 */
public class Debugging {

    // TODO 1: Debug Calculate Sum of Numbers in String
    public int calculateSumOfNumbersInString(String inputString) {
        String temp = "";
        int sum = 0;

        for(int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i); if(Character.isDigit(ch))
                temp += ch;
            else
                sum += Integer.parseInt(temp); temp = "0";
        }

        return sum + Integer.parseInt(temp);
    }


    // TODO 2: Debug Check Pair Sum Exists
    public boolean checkPairSumExists(int rows, int cols, int[][] arr, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if (set.contains(sum - arr[i][j])) {
                    return true;
                } else {
                    set.add(sum);
                }
            }
        }

        return false;
    }


    // TODO 3: Debug Remove Consecutive Vowels
    public String removeConsecutiveVowels(String str) {
        String str1 = "";
        str1 = str1+str.charAt(0);

        for (int i = 1; i < str.length(); i++)
            if ((!is_vowel(str.charAt(i - 1))) && (!is_vowel(str.charAt(i)))) {
                char ch = str.charAt(i);
                str1 = str1 + ch;
            }

        return str1;
    }
    // helper-function for removeConsecutiveVowels
    private boolean is_vowel(char ch) {
        return (ch == 'a') || (ch == 'e') ||
            (ch == 'i') || (ch == 'o') ||
            (ch == 'u');
    }


    // TODO 4: Debug Reverse Alphabet Chars Only
    public String reverseAlphabetCharsOnly(String inputString) {
        char[] inputChar = inputString.toCharArray();
        int right = inputString.length() - 1;
        int left = 0;

        while (left < right) {
            if (!Character.isAlphabetic(inputChar[left])) {
                left++;
            } else if(!Character.isAlphabetic(inputChar[right])) {
                right--;
            } else {
                char temp = inputChar[left];
                inputChar[left] = inputChar[right];
                inputChar[right] = temp;
            }
            left++; right--;
        }

        return new String(inputChar);
    }


    // TODO 5: Debug Compare Product
    public boolean compareProduct(int num) {
        if (num < 10) {
            return false;
        }

        int oddProdValue = 1, evenProdValue = 1;
        while (num > 0) {
            int digit = num / 10;
            oddProdValue *= digit;
            num = num / 10;

            if (num == 0) {
                break;
            }

            digit = num / 10;
            evenProdValue *= digit;
            num = num / 10;
        }

        if (evenProdValue == oddProdValue) {
            return true;
        }

        return false;
    }

    // TODO 6: Debug Count Triplet Sum Permutations
    public int countTripletSumPermutations(int size, int[] arr, int tripletSum) {
        int count = 0;

        for (int i = 0; i < size - 2; i++) {
            if (tripletSum % arr[i] == 0) {
                for (int j = 0; j < size - 1; j++) {
                    if (tripletSum % (arr[i] * arr[j]) == 0) {
                        int value = tripletSum / (arr[i] * arr[j]);
                        for (int k = j + 1; k < size; k++) {
                            if (arr[k] == value) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
