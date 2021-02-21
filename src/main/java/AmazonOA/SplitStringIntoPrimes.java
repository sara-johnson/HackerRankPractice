package AmazonOA;

public class SplitStringIntoPrimes {
    static final int MOD =1000000007;

    public static int waysToSplitStringIntoPrimes(String input, int i) {

        //loop through the string, first looking at each individual number
        //then looking at every two, then looking at every three...
// 1 based indexing
        if (i == 0)
            return 1;

        int cnt = 0;

        // Consider every suffix up to 6 digits
        for(int j = 1; j <= 6; j++)
        {

            // Number should not have
            // a leading zero and it
            // should be a prime number
            if (i - j >= 0 &&
                input.charAt(i - j) != '0' &&
                checkIfPrimeNumber(input.substring(i - j, i)))
            {
                cnt += waysToSplitStringIntoPrimes(input,
                    i - j);
                cnt %= MOD;
            }
        }

        // Return the final result
        return cnt;
    }

    private static boolean checkIfPrimeNumber(String number) {
        int numberToCheck = Integer.valueOf(number);

        for (int i = 2; i * i <= numberToCheck; i++) {
            if ((numberToCheck % i) == 0) {
                return false;
            }

        }
        return numberToCheck > 1 ? true : false;
    }

}
