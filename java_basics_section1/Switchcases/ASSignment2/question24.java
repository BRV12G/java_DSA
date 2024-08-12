package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int sum=0;
        int num;
        while(true){
            num = in.nextInt();
            if(num==0){
                break;
            }
             sum = sum+num;
            
        }
        System.out.println(sum);
        
        in.close();
    }
}
