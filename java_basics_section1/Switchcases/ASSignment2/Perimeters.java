package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class Perimeters {

    //8. Perimeter Of Circle
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the Radius of the circle");
    //     double radius = in.nextDouble();
    //     if(radius>0){
    //         double perimeterofcircle = 2*3.14*radius;
    //         System.out.println("The perimter is " +perimeterofcircle);
    //     }
    //     else{
    //         System.out.println("enter positive values");
    //     }
    // }

    //9. Perimeter Of Equilateral Triangle
    //  public static void main(String[] args) {
    //         Scanner in = new Scanner(System.in);
    //         System.out.println("Enter the side of the equilateral triangle");
    //         double side = in.nextDouble();
    //         if(side>0){
    //             double perimeterofEquiTri = 3*side;
    //             System.out.println("The perimter is " +perimeterofEquiTri);
    //         }
    //         else{
    //             System.out.println("enter positive values");
    //         }
    //         in.close();
    //     }


    //10.Perimeter Of Parallelogram
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter 1 : adjacent sides input");
    //     System.out.println("Enter 2 : one side and diagonals input");
    //     System.out.println("Enter 3 : base , height and angle input ");
    //     int choice = in.nextInt();
    //     switch(choice){
    //         case 1 -> {
    //             System.out.println("Enter length of side1");
    //             double side1 = in.nextDouble();
    //             System.out.println("Enter length of side2");
    //             double side2 = in.nextDouble();
    //             double perimeterofParallelogram = 2*(side1+side2);
    //             System.out.println("Perimter is " + perimeterofParallelogram);
    //         }

            // note : case 2 and 3 are wrong formulas
            // case 2 ->{
            //     System.out.println("Enter length of one side");
            //     double side = in.nextDouble();
            //     System.out.println("Enter length of diagonal1");
            //     double diagonal1 = in.nextDouble();
            //     System.out.println("Enter length of diagonal2");
            //     double diagonal2 = in.nextDouble();
            //     double perimeterofParallelogram = (2*side) + (Math.sqrt(Math.pow(diagonal1 , 2) + Math.pow(diagonal2 , 2)));
            //     System.out.println("Area is " + perimeterofParallelogram);
            // }
            // case 3 ->{
            //     System.out.println("Enter the base");
            //     double base = in.nextDouble();
            //     System.out.println("Enter the height");
            //     double height = in.nextDouble();
            //     System.out.println("Enter the angle in degres");
            //     double angle = in.nextDouble();
                
            //     double perimeterofParallelogram = ((2*base) + ((2*height)/Math.sin(angle)));
            //     System.out.println("Area is " + perimeterofParallelogram);  
            // }
    //         default -> System.out.println("invalid ");

    //     }
    // }

        // 11. Perimeter Of Rectangle
        // public static void main(String[] args) {
        //         Scanner in = new Scanner(System.in);
        //         System.out.println("Enter the side1 of the rect");
        //         double side1 = in.nextDouble();
        //         System.out.println("Enter the side2 of the rect");
        //         double side2 = in.nextDouble();
        //         if(side1>0 && side2>0){
        //             double perimeterofRect = 2*(side1+side2);
        //             System.out.println("The perimter is " +perimeterofRect);
        //         }
        //         else{
        //             System.out.println("enter positive values");
        //         }
        //         in.close();
        //     }


        // //12.Perimeter Of Square
        // public static void main(String[] args) {
        //         Scanner in = new Scanner(System.in);
        //         System.out.println("Enter the side of the square");
        //         double side = in.nextDouble();
        //         if(side>0){
        //             double perimeterofSqaure = 4*side;
        //             System.out.println("The perimter is " +perimeterofSqaure);
        //         }
        //         else{
        //             System.out.println("enter positive values");
        //         }
        //         in.close();
        //     }


        //13. Perimter of rhombus
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the side of the rhombus");
            double side = in.nextDouble();
            if(side>0){
                double perimeterofRhom = 4*side;
                System.out.println("The perimter is " +perimeterofRhom);
            }
            else{
                System.out.println("enter positive values");
            }
            in.close();
        }


    
}
