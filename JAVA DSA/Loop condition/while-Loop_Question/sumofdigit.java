public class sumofdigit {   
    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10; 
            sum += lastDigit; 
            n /= 10; 
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}