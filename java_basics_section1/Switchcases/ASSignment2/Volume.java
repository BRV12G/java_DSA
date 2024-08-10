package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class Volume {

    //14.VOLUME OF CONE 
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the radius");
    //     double radius = in.nextDouble();
    //     System.out.println("Enter the height");
    //     double height = in.nextDouble();
    //     double volume = (1.0/3.0)*Math.PI*(Math.pow(radius,2))*height;
    //     System.out.println("volume is: " +volume);

    // }
     

    //15. VOLUME OF PRISM
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the base");
    //     double base = in.nextDouble();
    //     System.out.println("Enter the height");
    //     double height = in.nextDouble();
    //     System.out.println("Enter the perpendicular height");
    //     double perpendicularheight = in.nextDouble();
    //     double volume = (1.0/2.0)*base*height*perpendicularheight;
    //     System.out.println("volume is: " +volume);
    //     in.close();

    // }

    
    //16. volume of cylinder
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the radius");
    //     double radius = in.nextDouble();
    //     System.out.println("Enter the height");
    //     double height = in.nextDouble();
    //     double volume = height*Math.PI*Math.pow(radius, 2);
    //     System.out.println("volume is: " +volume);
    //     in.close();

    // }

    //17. volume of sphere
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = in.nextDouble();
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("volume is: " +volume);
        in.close();

    }
    
}
