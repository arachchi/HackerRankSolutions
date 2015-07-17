package com.company.Algorithms.warmUp;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/17/15
 */
public class CaeserSCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String value = scanner.next();
        int k= scanner.nextInt();
        String answer = "";
        for(int i=0;i<size;i++){
            answer+=caeserSCipher(value.charAt(i),k);
        }
        System.out.println(answer);
    }

    public static char caeserSCipher(char text,int k){
        k%=26;
        if(text >64 && text<91){
            int val = text+k;
            if(val>90)
                val=64 + (val-90);

            return (char)(val);
        }
        else if(text > 96 && text <123){
            int val = text+k;
            if(val>122)
                val=96 + (val-122);

            return (char)(val);
        }
        else
            return text;

    }
}
