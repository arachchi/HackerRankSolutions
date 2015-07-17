package com.company.Algorithms.warmUp;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/17/15
 */
public class LongFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        System.out.println(factorial(BigInteger.valueOf(n)));
    }

    static BigInteger factorial(BigInteger n){
        if(n == BigInteger.ZERO)
            return BigInteger.ONE;
        if(n == BigInteger.ONE)
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
