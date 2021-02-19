package AmazonOA;

public class BreakAPalindrome {

    public String breakPalindrome(String input) {

        if(input == null || input.length() < 2) {
            return "";
        }

        char[] inputCharArray = input.toCharArray();
        int length = inputCharArray.length;

        for (int i = 0; i < length / 2; i++) {
            if (inputCharArray[0] != 'a') {
                inputCharArray[0] = 'a';
                return String.valueOf(inputCharArray);
            } else if (inputCharArray[i] > 'a') {
                inputCharArray[i] = 'a';
                return String.valueOf(inputCharArray);
            }

        }

        inputCharArray[length - 1] = 'b';
        return String.valueOf(inputCharArray);
    }

}
