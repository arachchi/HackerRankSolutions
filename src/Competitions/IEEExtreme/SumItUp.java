package Competitions.IEEExtreme;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 10/22/15
 */
public class SumItUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        BigInteger total;
        total = BigInteger.ZERO;
        for(int i=0;i<T;i++){
            total = total.add(BigInteger.valueOf(scanner.nextLong()));
        }

        int n = scanner.nextInt();
        BigInteger power =BigInteger.valueOf(2);
        power =power.pow(n);


        BigInteger val = BigInteger.valueOf(1000000007);
        BigInteger m=total.multiply(power);
        BigInteger answer = m.mod(val);

        System.out.println(answer);

    }
}
