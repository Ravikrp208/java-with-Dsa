
/* 
public class gendraretable {
    public static void main(String[] args) {
        System.out.println("Enter a table");

        int num = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}



*/
// package JAVA DSA.Loop condition.while-Loop_Question;
import java.util.Scanner;
public class gendraretable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table");
        int num = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
