package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class discount_question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Listed price");
        double listedprice = in.nextDouble();
        System.out.println("Enter the selling price");
        double sellingprice = in.nextDouble();
        if(sellingprice>0 && listedprice>0){
        double discount = listedprice  -  sellingprice;
        double rateOFdiscount = (discount/listedprice)*100;
        System.out.println("Discount on the product is" +discount);
        System.out.println("Discount % on the product is" +rateOFdiscount);
        }
        else{
            System.out.println("the selling price and listed price should  be positive");
        }
        in.close();
    }
}
