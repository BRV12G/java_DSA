package java_basics_section1;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");

        }
        else
        {
            System.out.println("Uppercase");
        }

    }
    
}
