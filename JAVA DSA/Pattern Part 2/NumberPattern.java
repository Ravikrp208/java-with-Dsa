import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // n must be odd

        int mid = n / 2; 

        for (int i = 0; i < n; i++) {
            int spaces = Math.abs(mid - i);
            int innerSpaces = n - 2 * spaces - 2;
            int num = mid + 1 - spaces;

            // leading spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            System.out.print(num);

            // middle spaces
            if (innerSpaces >= 0) {
                for (int s = 0; s < innerSpaces; s++) {
                    System.out.print(" ");
                }
                System.out.print(num);
            }

            System.out.println();
        }
        sc.close();
    }
}
