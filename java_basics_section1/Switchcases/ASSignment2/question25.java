package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int largest=0;

        while(true){
            num = in.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }
        
            
        }
        System.out.println(largest);
    }
}
