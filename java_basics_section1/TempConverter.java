package java_basics_section1;
import java.util.Scanner;


public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter temperature in celcius ");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
    

    
}
