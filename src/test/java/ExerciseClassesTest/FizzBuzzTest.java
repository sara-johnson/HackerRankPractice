package ExerciseClassesTest;

import ExerciseClasses.FizzBuzz;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_int9Input_returnsList() {
        //GIVEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input_9 = 9;

        //WHEN
        List<String> resultList = fizzBuzz.fizzBuzz(input_9);

        //THEN
        Assert.assertEquals(9, resultList.size());
    }
}
