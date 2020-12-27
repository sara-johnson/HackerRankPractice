package ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * <p>
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five
 * output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> returnList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                returnList.add("FizzBuzz");
            } else if (i % 5 == 0) {
                returnList.add("Buzz");
            } else if (i % 3 == 0) {
                returnList.add("Fizz");
            } else {
                returnList.add(String.valueOf(i));
            }
        }
        return returnList;
    }
}
