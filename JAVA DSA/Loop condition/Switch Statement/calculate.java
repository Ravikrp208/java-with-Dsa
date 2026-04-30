
import java.util.Scanner;
public class calculate {
    int a,b ;
    
void input (int x, int y)
    {
        a =x;
        b =y;
    }

    void display(int c)
    {
        switch (c)
        {
            case 1:
                System.out.println("Addition: " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication: " +(a*b));
                break;
            case 4:    
                System.out.println("Division: " + (a/b));
                break;
            case 5:
                System.out.println("Remainder: " + (a%b));  
                break;
                default:
                 System.out.println("Invalid choice");  
        }
    }

    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Choose an operation: ");
        int operation = sc.nextInt();
        calculate c = new calculate();
        c.input(n,m);
        c.display(operation);
    }
}
