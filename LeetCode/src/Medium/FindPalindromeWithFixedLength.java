package Medium;

import java.math.BigInteger;

public class FindPalindromeWithFixedLength {
    public static void main(String[] args) {
        int[] queries2 = {1, 2, 3, 4, 5};
        kthPalindrome(queries2,5);
    }

    public static void kthPalindrome(int[] queries, int intLength) {

        BigInteger[] result= new BigInteger[queries.length];

        int halfLength = (intLength + 1) / 2;

        BigInteger lowerBound = BigInteger.TEN.pow(halfLength - 1); // Lower bound for the first half
        BigInteger upperBound = BigInteger.TEN.pow(halfLength).subtract(BigInteger.ONE); // Upper bound for the first half
        System.out.println("halfLength: "+halfLength);
        System.out.println("lowerBound: "+lowerBound);
        System.out.println("upperBound: "+upperBound);

        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];

            // Calculate the first half based on the query
            BigInteger firstHalf = lowerBound.add(BigInteger.valueOf(query - 1));

            if (firstHalf.compareTo(upperBound) > 0) {
                result[i] = BigInteger.valueOf(-1);
            } else {
                // Generate the palindrome based on the first half
                result[i] = generatePalindrome(firstHalf, intLength);
            }
        }
    }

    public static BigInteger generatePalindrome(BigInteger firstHalf, int intLength) {
        String firstHalfStr = firstHalf.toString();

        // If the length is odd, mirror the first half excluding the last digit
        if (intLength % 2 == 0) {
            // Even length palindrome: mirror the first half exactly
            String palindromeStr = firstHalfStr + new StringBuilder(firstHalfStr).reverse().toString();
            return new BigInteger(palindromeStr);
        } else {
            // Odd length palindrome: exclude the middle digit and mirror the rest
            String palindromeStr = firstHalfStr + new StringBuilder(firstHalfStr.substring(0, firstHalfStr.length() - 1)).reverse().toString();
            return new BigInteger(palindromeStr);
        }
    }
}
