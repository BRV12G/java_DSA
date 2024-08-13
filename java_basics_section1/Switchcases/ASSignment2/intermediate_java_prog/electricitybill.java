package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the kwh ");
        double kwh = in.nextDouble();
        double bill = 0;
        if(kwh>0){
            if(kwh<=100){
                bill = kwh*10;
            }
            else if(kwh<=200){
                bill = 100*10 + (kwh-100)*20;
            }
            else{
                bill = 100*10 + 100*20 + (kwh-200)*30;
            }
            System.out.println(bill);
        }
        else{
            System.out.println("enter positive units");
        }
        in.close();
    }
}