package java_basics_section1;

import java.util.Scanner;

public class LargestOf3 {

    //APPROACH 1

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     int a = input.nextInt();
    //     int b = input.nextInt();
    //     int c = input.nextInt();

    //     int max = a;
    //     if(b>max){
    //         max=b;
    //     }
    //     if(c>max){
    //         max=c;
    //     }
    //         System.out.println(max);
        

    //     input.close();
    // }

    //Approach 2 

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     int a = input.nextInt();
    //     int b = input.nextInt();
    //     int c = input.nextInt();

    //     int max = 0;
    //     if(a>b){
    //         max=a;
    //     }
    //     else{
    //         max = b;
    //     }
    //     if(c>max){
    //         c=max;
    //     }
    //     System.out.println(max);

        
    // }


    //Approach 3 
    public static void main(String[] args) {
        System.out.println(Math.max(34,57));

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c , (Math.max(a,b)));
        System.out.println(max);
    
    }
}
