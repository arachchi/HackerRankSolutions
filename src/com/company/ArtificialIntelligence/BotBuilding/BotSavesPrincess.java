package com.company.ArtificialIntelligence.BotBuilding;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class BotSavesPrincess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer x = scanner.nextInt();
        Integer myPosition=(N-1)/2;
        Integer princessPositionX=0,princessPositionY=0;
        char[][] grid = new char[N][N];

        for(int i=0;i<N;i++){
            String value = scanner.next();
            for(int j=0;j<N;j++){
                grid[i][j] = value.charAt(j);
                if(value.charAt(j) == 'p'){
                    princessPositionY=i;
                    princessPositionX=j;
                }

            }
        }

        next(x, y, princessPositionX, princessPositionY);

    }
    public static void pathToPrincess(Integer myPosition,Integer princessPositionX,Integer princessPositionY){
        int up,down,left,right;
        if(myPosition-princessPositionY>0){
            up=myPosition-princessPositionY;
            for(int i=0;i<up;i++)
                System.out.println("UP");
        }else if(princessPositionY-myPosition>0){
            down=princessPositionY-myPosition;
            for(int i=0;i<down;i++)
                System.out.println("DOWN");
        }
        if(princessPositionX-myPosition>0){
            right=princessPositionX-myPosition;
            for(int i=0;i<right;i++)
                System.out.println("RIGHT");
        }else if(myPosition-princessPositionX>0){
            left=myPosition-princessPositionX;
            for(int i=0;i<left;i++)
                System.out.println("LEFT");
        }


    }
    public static void next(Integer x,Integer y,Integer princessPositionX,Integer princessPositionY){
        int up=0,down=0,left=0,right=0;
        int directionY=0,directionX=0;
        if(y-princessPositionY>0){
            up=y-princessPositionY;
            directionY=up;

        }else if(princessPositionY-y>0){
            down=princessPositionY-y;
            directionY=down;

        }
        if(princessPositionX-x>0){
            right=princessPositionX-x;
            directionX = right;

        }else if(x-princessPositionX>0){
            left=x-princessPositionX;
            directionX=left;

        }

        if(directionX>directionY){
            if(left>right){
                //for(int i=0;i<left;i++)
                System.out.println("LEFT");
            }else{
                //for(int i=0;i<right;i++)
                System.out.println("RIGHT");
            }

        }else{
            if(up>down)
                //for(int i=0;i<up;i++)
                System.out.println("UP");
            else
                //for(int i=0;i<down;i++)
                System.out.println("DOWN");
        }


    }
}
