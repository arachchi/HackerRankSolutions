package com.company.Algorithms.warmUp;

import java.util.Scanner;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/17/15
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.next();

        String[] strings = val.split(":");
        String hh = strings[0];
        String mm = strings[1];
        String ss = strings[2];
        String time = ss.substring(2);
        ss = ss.substring(0,2);

        if(time.equals("PM")){
            if(Integer.parseInt(hh)<12){
                hh = String.valueOf((Integer.parseInt(hh) +12));
            }
        }
        if(time.equals("AM"))
            if(Integer.parseInt(hh) == 12)
                hh = "00";


        System.out.println(hh +":"+mm+":" +ss);

    }

}
