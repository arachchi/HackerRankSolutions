package com.company.Algorithms.warmUp;

import java.util.Scanner;
import java.math.*;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/17/15
 */
public class DiagonalDifference {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int total=0;
        int[][] matrix = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<N;i++){
            total+= (matrix[i][i] - matrix[i][N-1-i]);
        }

        System.out.println(Math.abs(total));
    }
}
