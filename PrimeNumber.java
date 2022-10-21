
// Write a program to print prime numbers from 1 to 10.

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        System.out.println("Prime numbers between 1 to 10: ");
        for (int i = 2; i <= 10; i++) {
            
            int chk = 0;
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    chk++;
                    break;
                }
            }
            if (chk == 0) {
                System.out.println(i);
            }
        }
    }
}
