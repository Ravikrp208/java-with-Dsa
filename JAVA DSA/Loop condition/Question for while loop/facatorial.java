// package JAVA DSA.Loop condition.while-Loop_Question;
/* Accept a value and find the factorial value 
   n = n* n-1
     = n*(n-1) *n-1
*/

import java.util.Scanner;

public class facatorial {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factorial number");
        int n = sc.nextInt();
        int f = 1;
        while (n>1)
        {
            f = f*n;
            n--;
        }   
        System.out.println("Factorial is " + f);
    }
}
     
       
