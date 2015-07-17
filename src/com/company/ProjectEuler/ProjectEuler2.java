package com.company.ProjectEuler;

import java.util.Scanner;

public class ProjectEuler2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long T = scanner.nextLong();
        double start = System.nanoTime();

        for(long i=0;i<T;i++){
            Long test = scanner.nextLong();
            long total= evenFib(Long.valueOf(1),Long.valueOf(2),test);

            System.out.println(total);
        }
        double end = System.nanoTime();
        //System.out.println((end - start)/1000000000);
    }

    /*
    * Return the values of even Numbers in the Fib Sequence
    * */
    public static Long evenFib(Long prev, Long next,Long limit){
        if(next>limit)
            return Long.valueOf(0);
        else if ((next.byteValue() & 0x00000001L) == 0){
            return next + evenFib(next,prev+next,limit);
        }
        else {
            return evenFib(next,prev+next,limit);
        }

    }
}
