package com.company.ProjectEuler;

import java.util.Scanner;

public class ProjectEuler1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long T = scanner.nextLong();
        double start = System.nanoTime();

        for(long i=0;i<T;i++){
            Long test = scanner.nextLong();

            long multi_five=test/5;
            long multi_three=test/3;
            long multi_fifteen=test/15;
            if(test % 3 ==0){
                multi_three--;
            }
            if(test % 5 ==0){
                multi_five--;
            }
            if(test % 15 ==0){
                multi_fifteen--;
            }
            long total =(5*triangleVal(multi_five) + 3*triangleVal(multi_three) - 15*triangleVal(multi_fifteen));

            System.out.println(total);
        }
        double end = System.nanoTime();
        System.out.println((end - start)/1000000000);
    }

    public static Long triangleVal(Long n){
        if(n == 0 )
            return Long.valueOf(0);
        else
            return  (n*(n+1)) >>> 1;
    }
}
