package com.company.Algorithms.warmUp;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/17/15
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualD = scanner.nextInt();
        int actualM = scanner.nextInt();
        int actualY = scanner.nextInt();

        int expectedD = scanner.nextInt();
        int expectedM = scanner.nextInt();
        int expectedY = scanner.nextInt();

        int fine=0;

        if((expectedM > actualM) && (expectedY >= actualY))
            fine = 0;
        else if((expectedM == actualM) && (expectedY == actualY))
            if(expectedD>actualD)
                fine = 0;
            else
                fine = (actualD-expectedD)*15;
        else if((expectedM < actualM) && (expectedY == actualY))
            fine = (actualM-expectedM)*500;
        else if(expectedY != actualY)
            fine = 10000;

        System.out.println(fine);
    }
}
