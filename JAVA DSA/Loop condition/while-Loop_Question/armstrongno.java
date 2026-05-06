
import java.util.Scanner;

public class armstrongno {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10; 
            sum = sum + (lastDigit * lastDigit * lastDigit); 
            n = n / 10; 
        } 

        if (sum == originalNumber) {
            System.out.println("  Armstrong number.");
        } else {
            System.out.println( " not an Armstrong number.");
        }         
    }
}
