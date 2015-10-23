package Competitions.CounterCode;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/2/15
 */
public class PoisonousPlants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer N= scanner.nextInt();
        tree start = new tree();
        start.value = scanner.nextInt();
        tree iterator = start;
        for(int i=1;i<N;i++){
            iterator.left = new tree();
            iterator.left.value = scanner.nextInt();
            iterator = iterator.left;
        }
        boolean die = true,attemp=false;
        int noOfDays=0;
        iterator = start;
        tree temp;
        while(die) {
            while (iterator.left != null) {
                if(iterator.left.value > iterator.value){
                    //iterator.left dies
                    //temp value updated
                    temp=iterator.left;

                    if(temp.left != null) {
                        if(iterator.right != null)
                            iterator.right.left = temp.left;
                        else
                            iterator.left = temp.left;
                        if(temp.left.value>temp.value)
                            iterator = temp;
                        else
                            iterator = temp.left;
                    }
                    else {
                        if(iterator.right !=null)
                            iterator.right.left = null;
                        else
                            iterator.left = null;
                    }
                    attemp=true;

                }else {
                    iterator = iterator.right.left;
                }
            }
            die = attemp?true:false;
            noOfDays = die?noOfDays+1:noOfDays;
            iterator = start;
            attemp = false;
        }
        System.out.println(noOfDays);
    }

    static class tree{
        int value;
        tree left=null;
        tree right=null;
    }
}
