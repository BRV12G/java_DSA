package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class battingavg_question9 {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        System.out.println("enter the number of runs");
        double noofruns = in.nextDouble();
        System.out.println("enter the number of times out");
        double timesout = in.nextDouble();
        if(timesout==0){
            System.out.println("batting avg cannot be calculate");
        }
        else{
        double battingavg = noofruns/timesout;
        System.out.println("the batting avg is : " +battingavg);
    }
    }
}
