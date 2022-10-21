
// Write a program to swap two numbers without using third variable 

import java.util.Scanner;

public class SwapNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter 2nd number: ");
        int number2 = input.nextInt();
        
        System.out.println();
        System.out.println("Values Before Swap: \nnumber1 = " + number1 + "\tnumber2 = " + number2);
        System.out.println();
        
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        
        System.out.println("Values After Swap: \nnumber1 = " + number1 + "\tnumber2 = " + number2);
    }
}
