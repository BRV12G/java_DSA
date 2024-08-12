package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int fact=1;
    
            
        if(num>0){
            for(int i =1;i<=num;i++){ //1<=3 2 //2<3 3 // 3<=3 4
                fact = fact*i;  // 1*1 // 1*2 // 2*3 6
                
            }
        }
        System.out.println(fact);
        in.close();
    }
}
