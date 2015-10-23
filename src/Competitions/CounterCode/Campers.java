package Competitions.CounterCode;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class Campers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        Integer K = scanner.nextInt();
        boolean[] players = new boolean[N];

        Integer sniper;
        for(int i=0;i<K;i++){
            sniper = scanner.nextInt();
            sniper--;
            if(sniper-1>=0)
                players[sniper-1] = true;
            if(sniper+1<N)
                players[sniper+1] = true;
        }
        Integer totalPlayers=0;
        for(int i=0;i<N;i++){
            if(i+1<N & players[i] == false && players[i+1]== false)
                players[i+1] = true;
            if(players[i] == false){
                totalPlayers++;
            }
        }
        System.out.println(totalPlayers);
    }
}
