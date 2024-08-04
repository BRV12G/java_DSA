package java_basics_section1;

import java.util.Scanner;

public class Loops {
    //FOR LOOP
    // public static void main(String[] args) {
    //     for(int num = 1 ; num<=5;num++){
    //         System.out.println(num);
    //     }

    //     //user input for 
    //     Scanner input = new Scanner (System.in);
    //     int n = input.nextInt();
    //     for(int i = 1 ; i<= n ; i++){
    //         System.out.print(i + " ");
    //         System.out.println("hello");
    //     }
    //     input.close();
    // }

    //WHILE LOOP
    // public static void main(String[] args) {
    //     int num = 1;
    //     while(num<=5){
    //         System.out.println(num);
    //         num++;
    //     }
    // }

    //DO WHILE LOOP
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while(n<=5);
    }
}
