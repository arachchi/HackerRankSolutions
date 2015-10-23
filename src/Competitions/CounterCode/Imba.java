package Competitions.CounterCode;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class Imba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer T = scanner.nextInt();
        int N;

        for(int i=0;i<T;i++){
            N = scanner.nextInt();
            int val=N/2,j=val,increase = val,decrease = val+1;
                if((N&1)== 1){
                    for(;j>0;j--) {
                        increase++;
                        decrease--;
                        System.out.print( increase+" "+ decrease+" ");
                    }
                    increase++;
                    System.out.print(increase);
                }else{
                    for(;j>0;j--) {
                        increase++;
                        decrease--;
                        System.out.print( decrease+" "+increase+" ");
                    }
                }
            System.out.println();

        }
    }

    public static void last(Integer N){
        Integer[] values = new Integer[N];
        int val=N/2;

        int increase = val;
        int decrease = val+1;

        for(int j=N/2;j>=0;j--){
            if(N%2 ==1){
                increase++;
                decrease--;
                System.out.printf("%d ", increase);
                if(j!=0)
                    System.out.printf("%d ",decrease);
            }else{
                increase++;
                decrease--;
                if(j!=0) {
                    System.out.printf("%d ", decrease);
                    System.out.printf("%d ", increase);
                }
            }
        }
        System.out.println();
    }

    public static void goingToWin(Integer N){
        Integer[] values = new Integer[N];
        int val=0;
        for(int j=N-1;j>=0;j-=2){
            val++;
            values[j]=N+1-val;
            if(j>0)
                values[j-1]=val;
        }


        for(int v=0;v<N;v++)
            System.out.printf("%d ",values[v]);
        System.out.println();
    }

    public static void execute(Integer N){
        Integer[] values = new Integer[N];
        for(int j=0;j<N;j++){
            values[j]=j+1;
        }

        boolean iterate = true;
        for(int k=N-1;k>0 ;k--) {
            if(values[k]+values[k-1]>N+1){
                shiftLeft(values,k-1);
            }

        }
        for(int v=0;v<N;v++)
            System.out.printf("%d ",values[v]);
        System.out.println();
    }

    public static void shiftLeft(Integer[] N, Integer from){
        int temp=N[0];
        for(int i=0;i<from;i++){
            N[i]=N[i+1];
        }
        N[from]=temp;
    }

    public static void compute(Integer N){
        Integer[] values = new Integer[N];
        for(int j=0;j<N;j++){
            values[j]=j+1;
        }

        boolean iterate = true;
        for(int k=0;k<N && iterate;k++) {
            int temp = values[0];
            int index = 0;

            for(int l=0;l<N && iterate;l++) {
                int upperLimit = checkCondition(values);
                if (upperLimit>0) {
                    if (index <= upperLimit) {
                        values[index] = values[index + 1];
                        index++;
                        values[index] = temp;
                    }
                } else
                    iterate = false;
            }

        }
        for(int v=0;v<N;v++)
            System.out.printf("%d ",values[v]);
        System.out.println();
    }
    public static void checkVal(Integer N){
        Integer[] values = new Integer[N];
        for(int i=0;i<N;i++){
            values[i] = 0;
        }

    }
    public static Integer checkCondition(Integer[] N){
        int temp=0;
        for(int i=0;i<N.length-1;i++){
            if(N[i]+N[i+1]>(N.length+1)){
                temp = i;
            }
        }

        return temp;
    }
}
