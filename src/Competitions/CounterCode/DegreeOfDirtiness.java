package Competitions.CounterCode;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class DegreeOfDirtiness {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer T = scanner.nextInt();

        for(int i=0;i<T;i++) {
            Integer N = scanner.nextInt();
            Integer M = scanner.nextInt();
            Integer[] toilets = new Integer[N];

            for(int j=0;j<N;j++){
                toilets[j] = 0;
            }
            int j=0,toiletNo,index=0;
            while(j<M){
                j++;
                index = selectLeftToilet(toilets,N);
                toilets[index]++;
                j++;
                if(j<=M) {
                    index = selectRightToilet(toilets,N);
                    toilets[index]++;
                }
            }

            System.out.println((index+1) + " " + (toilets[index]-1));
        }
    }
    public static int selectLeftToilet(Integer[] toilets,int N){
        int min=toilets[0];
        int index = 0;
        for(int i=0;i<N/2;i++){
            if(toilets[i]>toilets[i+1]){
                min = toilets[i+1];
                index = i+1;
            }
        }
        return index;
    }

    public static int selectRightToilet(Integer[] toilets,int N){
        int min=toilets[N-1];
        int index = N-1;
        for(int i=0;i<N/2;i++){
            if(toilets[N-i-1]>toilets[N-i-2]){
                min = toilets[N-i-2];
                index = N-i-2;
            }
        }
        return index;
    }
}
