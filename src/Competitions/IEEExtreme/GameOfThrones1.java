package Competitions.IEEExtreme;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 10/23/15
 */
public class GameOfThrones1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        int[] values = new int[26];
        for(int i=0;i<26;i++)
            values[i]=0;
        char val;
        for(int i=0;i<key.length();i++){
            val = key.charAt(i);
            values[val-97]++;
        }

        boolean condition=true;
        boolean finalDecision = true;
        for(int i=0;i<26;i++){
            if(values[i]%2 != 0){
                if(condition) {
                    condition = false;
                }
                else{
                    finalDecision = false;
                    break;
                }

            }
        }
        if(finalDecision)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
