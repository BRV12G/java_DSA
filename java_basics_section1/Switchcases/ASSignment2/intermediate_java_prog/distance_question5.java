package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class distance_question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the point 1");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("enter the point 2");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double dist = Math.sqrt(Math.pow(x2-x1 , 2) + Math.pow(y2-y1,2));
        System.out.println(dist);
        in.close();
    }
}
