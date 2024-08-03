package java_basics_section1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // typecasting from float to int 
        Scanner input = new Scanner(System.in);
        int num1 = (int)(67.4f);
        System.out.println("the typecasted float to int is " + num1);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //257 % 256
        System.out.println(b);

        byte c = 70;
        byte d = 40;
        byte e = 10;
        int f  =  c*d/e;
        System.out.println(f);

        //ascii unicode values possible due to automatic type conversion. 
        int number = 'A';
        System.out.println(number);

        System.out.println("नमस्ते");

        System.out.println(3 *5.666); //float value printed. type  promotion rule saying the expression promoted to the higher value.

        // eg final for type promotion 
        byte x = 42;
        char y = 'a';
        short s = 1024;
        int i = 50000;
        float z = 5.67f;
        double k = 0.1234;
        double result = (z * x) + (i/y) - (k*s);
        //float  + int - double = double (since highest values are of double).
        System.out.println((z * x) + " " + (i/y) + " "  + (k*s));
        System.out.println(result);





    }
    
}
