
    import java.util.Scanner;
public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int num = 1;
        int count = 0;

        while (num <= N) {
            int temp = num;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }
            boolean isPrime1 = true;

            if (num < 2) {
                isPrime1 = false;
            } else {
                int i = 2;
                while (i <= num / 2) {
                    if (num % i == 0) {
                        isPrime1 = false;
                        break;
                    }
                    i++;
                }
            }
            boolean isPrime2 = true;

            if (reverse < 2) {
                isPrime2 = false;
            } else {
                int j = 2;

                while (j <= reverse / 2) {
                    if (reverse % j == 0) {
                        isPrime2 = false;
                        break;
                    }
                    j++;
                }
            }
            if (isPrime1 && isPrime2) {
                System.out.println(num);
                count++;
            }

            num++;
        }

        System.out.println("\nTotal = " + count);

        sc.close();
    }
}

