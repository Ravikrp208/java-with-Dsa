public class Patternno {

    public static void palindromePattern_no(int n) {

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromePattern_no(5);
    }
}
