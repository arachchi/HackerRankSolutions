package Competitions.w17;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 9/1/15
 */
public class FindTheRobot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer T = scanner.nextInt();
        long j;

        for(int i=0;i<T;i++){
            j = scanner.nextLong();
            long x,y,n;
            n=j/4;

                if(j%4 == 1){
                    x= (n*(-2))+j;
                    y= (n*(-2));
                }
                else if(j%4 == 2){
                    x=(n*(-2)) + (j-1);
                    y=(n*(-2)) + j;
                }
                else if(j%4 == 3){
                    x=(n*(-2)) -2;
                    y=(n*(-2)) +j;
                }
                else {
                    x= (n*(-2));
                    y= (n*(-2));
                }

            System.out.println(x +" " + y);
        }

    }
}
