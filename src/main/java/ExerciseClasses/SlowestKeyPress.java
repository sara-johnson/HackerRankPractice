package ExerciseClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A newly designed keypad was tested, where a tester pressed a sequence of n keys, one at a time.
 *
 * You are given a string keysPressed of length n, where keysPressed[i] was the ith key pressed in the
 * testing sequence, and a sorted list releaseTimes, where releaseTimes[i] was the time the ith key was
 * released. Both arrays are 0-indexed. The 0th key was pressed at the time 0, and every subsequent key
 * was pressed at the exact time the previous key was released.
 *
 * The tester wants to know the key of the keypress that had the longest duration. The ith keypress had
 * a duration of releaseTimes[i] - releaseTimes[i - 1], and the 0th keypress had a duration of releaseTimes[0].
 *
 * Note that the same key could have been pressed multiple times during the test, and these multiple presses
 * of the same key may not have had the same duration.
 *
 * Return the key of the keypress that had the longest duration. If there are multiple such keypresses, return
 * the lexicographically largest key of the keypresses.
 * https://leetcode.com/problems/slowest-key/
 */
public class SlowestKeyPress {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxTimeValue = 0;
        Character maxCharValue = ' ';

        for (int i = keysPressed.length() - 1; i > 0; i--) {
            if((releaseTimes[i] - releaseTimes[i - 1]) == maxTimeValue && (Character.valueOf(keysPressed.charAt(i)).compareTo(maxCharValue) > 0)) {
                maxCharValue = keysPressed.charAt(i);
            }
            if ((releaseTimes[i] - releaseTimes[i - 1]) > maxTimeValue) {
                maxTimeValue = (releaseTimes[i] - releaseTimes[i - 1]);
                maxCharValue = keysPressed.charAt(i);
            }
        }

        if (releaseTimes[0] == maxTimeValue && keysPressed.charAt(0) > maxCharValue) {
            maxCharValue = keysPressed.charAt(0);
        }
        if (releaseTimes[0] > maxTimeValue) {
            maxCharValue = keysPressed.charAt(0);
        }
        return maxCharValue;
    }
}
