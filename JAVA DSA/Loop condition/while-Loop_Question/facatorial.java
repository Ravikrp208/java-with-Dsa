// package JAVA DSA.Loop condition.while-Loop_Question;

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
     
       
