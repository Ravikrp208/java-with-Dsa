public class PerfectNumber {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 1000) {

            int n = i;
            int s = 0;
            int j = 1;

            while (j <= n / 2) {

                if (n % j == 0) {
                    s = s + j;
                }

                j++;
            }

            if (s == i) {
                System.out.println(i);
            }

            i++;
        }
    }
}