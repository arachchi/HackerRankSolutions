package Competitions.IEEExtreme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 10/21/15
 */
public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int mainDiagonal = 0;
        int square[][] = new int[N][N];
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                square[i][j]=scanner.nextInt();
            }
        }

        //get the main diagonal value
        for(int k=0;k<N;k++){
            mainDiagonal += square[k][k];
        }

        //check columns weather they sum up to the m.d
        int total;
        for(int j=N-1;j>=0;j--){
            total=0;
            for(int i=0;i<N;i++){
                total += square[i][j];
            }
            if(total!=mainDiagonal){
                list.add(-(j+1));
            }
        }

        //check the anti diagonal
        total=0;
        for(int k=0;k<N;k++){
            total += square[k][N-1-k];
        }
        if(total!=mainDiagonal){
            list.add(0);
        }

        //check the rows
        for(int i=0;i<N;i++){
            total=0;
            for(int j=0;j<N;j++){
                total += square[i][j];
            }
            if(total != mainDiagonal){
                list.add(i+1);
            }
        }
        //print values
        System.out.println(list.size());
        if(list.size()!=0){
            for(Integer i:list){
                System.out.println(i);
            }
        }

    }
}
