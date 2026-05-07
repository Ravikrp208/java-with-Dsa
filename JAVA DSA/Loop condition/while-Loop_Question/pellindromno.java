
import java.util.Scanner;

public class pellindromno {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10; 
            reverse = (reverse * 10) + lastDigit; 
            n = n / 10; 
        }   
        if (originalNumber == reverse) {
            System.out.println(" is a palindrome.");
        } else {
            System.out.println(" is not a palindrome.");
        }

    }
    
}
