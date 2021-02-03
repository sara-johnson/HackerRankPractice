package AmazonOA;

public class BreakAPalindrome {

    public String breakPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) > 'a') {
                sb.append('a');
                sb.append(input.substring(i + 1));
                return sb.toString();
            }
            sb.append(input.charAt(i));
        }

        return "";
    }

}
