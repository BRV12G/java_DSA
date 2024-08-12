package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class Surfaceareas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height = input.nextDouble();
        double CSA = 2*Math.PI*radius*height;
        Double TSA = 2*Math.PI*radius*(height+radius);
        System.out.println("Total surface area of cylinder is :" +TSA);
        System.out.println("Curved surface area of cylinder is :" +CSA);
        input.close();
    }
}
