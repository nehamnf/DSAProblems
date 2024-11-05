package Easy;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {

        System.out.println(addBinary("101","1"));
    }

    public static String addBinary(String a, String b) {

        // Parse the binary strings using BigInteger
        BigInteger val1 = new BigInteger(a, 2);
        BigInteger val2 = new BigInteger(b, 2);

        // Perform the binary addition with carry using BigInteger
        while (!val2.equals(BigInteger.ZERO)) {
            BigInteger answer = val1.xor(val2);           // XOR for sum without carry
            BigInteger carry = val1.and(val2).shiftLeft(1); // AND and shift left to calculate carry
            val1 = answer;
            val2 = carry;
        }

        // Convert the final result to a binary string
        return val1.toString(2);
    }
}
