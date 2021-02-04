package ExerciseClassesTest;

import ExerciseClasses.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    public void fizzBuzz_int9Input_returnsList() {
        //GIVEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input_9 = 9;

        //WHEN
        List<String> resultList = fizzBuzz.fizzBuzz(input_9);

        //THEN
        assertEquals(9, resultList.size());
    }
}
