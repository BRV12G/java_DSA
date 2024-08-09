package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class AREAS {

    //1. area of circle
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the radius of the Circle");
    //     double radius = in.nextDouble();
       
    //     double areaofcircle = 3.14*radius*radius;
    //     System.out.println("Area of circle is :" +areaofcircle);
    //     in.close();
    // }

    //2.Area Of Triangle

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the base of the traingle");
    //     double base = in.nextDouble();
    //     System.out.println("Enter the height of the triangle");
    //     double height = in.nextDouble();
       
    //     double areaofTri = 0.5*base*height;
    //     System.out.println("Area of circle is :" +areaofTri);
    //     in.close();
    // }

    //3.Area of Rectangle Program 
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the base of the rectangle");
    //     double base = in.nextDouble();
    //     System.out.println("Enter the height of the rectangle");
    //     double height = in.nextDouble();
       
    //     double areaofRect = base*height;
    //     System.out.println("Area of circle is :" +areaofRect);
    //     in.close();
    // }

    // //4. Area Of Isosceles Triangle
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the base of the triangle");
    //     double base = in.nextDouble();
    //     System.out.println("Enter the length of equal sides of the triangle");
    //     double length = in.nextDouble();

    //     double height = Math.sqrt(Math.pow(length,2) - Math.pow(base/2, 2));
       
    //     double areaofIsocelesTriangle = 0.5*base*height;
    //     System.out.println("Area of circle is :" +areaofIsocelesTriangle);
    //     in.close();
    // }

    //5. Area Of Parallelogram
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the base of the triangle");
    //     double base = in.nextDouble();
    //     System.out.println("Enter the length of equal sides of the triangle");
    //     double length = in.nextDouble();

    //     double height = Math.sqrt(Math.pow(length,2) - Math.pow(base/2, 2));
       
    //     double areaofIsocelesTriangle = 0.5*base*height;
    //     System.out.println("Area of circle is :" +areaofIsocelesTriangle);
    //     in.close();
    // }

   //5. Area Of Parallelogram
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the base of the parallelogram");
    //     double base = in.nextDouble();
    //     System.out.println("Enter the height of the parallelogram");
    //     double height = in.nextDouble();

        
    //     double areaofParallelogram = base*height;
    //     System.out.println("Area of parallelogram is :" +areaofParallelogram);
    //     in.close();
    // }

    //6.Area Of Rhombus
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("enter 1 if you want to give diagonals as input , enter 2 if you want to give side and perpedicular height as input");
    //     int choice = in.nextInt();
    //     switch(choice){
    //       case 1 -> {
    //         System.out.println("Enter length of diagonal one");
    //         double d1 = in.nextDouble();
    //         System.out.println("Enter length of diagonal two");
    //         double d2 = in.nextDouble();
    //         if(d1>0 && d2>0){
    //             double areaofrhombus = (d1*d2)/2;
    //             System.out.println("Area of Rhombus is " + areaofrhombus);
    //         }
    //         else{
    //             System.out.println("enter positive values");
    //         }
            
    //       }
    //       case 2 -> {
    //         System.out.println("enter the perpendicular height");
    //         double height = in.nextDouble();
    //         System.out.println("Enter side length");
    //         double side = in.nextDouble();
    //         if(side>=0 && height>=0){
    //             double areaofrhombus = side*height;
    //             System.out.println("Area of Rhombus is " + areaofrhombus);
    //         }
    //         else{
    //             System.out.println("enter positive values");
    //         }

    //       }
    //       default -> System.out.println("Invalid choice");
    //     }
    //     in.close();
    // }

    //7. Area of Equilateral Triangle
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the side of the equilateral triangle");
            double side = in.nextDouble();
            
    
            if(side>0){
            double areaofEquiTri = (Math.sqrt(3)/4)*side*side;
            System.out.println("Area of equilateral triangle is :" +areaofEquiTri);
            }
            else{
                System.out.println("Enter positive values");
            }
            
            in.close();
        }


}
