
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        
     System.out.println("Enter a no!");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 ==0){
            System.out.println("Event number!");
        }
        else{
            System.out.println("Odd number");
           }
    }
}
