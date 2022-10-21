
// Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class GreatestNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter 2nd number: ");
        int number2 = input.nextInt();
        
        System.out.println("Enter 3rd number: ");
        int number3 = input.nextInt();
      
        
        System.out.print("The greatest number is: ");
        
        if (number1 > number2 && number1 > number3) {
            
            System.out.println(number1);
        }
        else if (number2 > number1 && number2 > number3) {
            
            System.out.println(number2);
        } else {
            
            System.out.println(number3);
        }
    }
}
