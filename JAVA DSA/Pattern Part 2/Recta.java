// package JAVA DSA.Pattern Part 2;
public class Recta {

    public static void hollow_rectangle(int toRows, int toCols) {

        for (int i = 1; i <= toRows; i++) {
            for (int j = 1; j <= toCols; j++) {

                // border condition
                if (i == 1 || i == toRows || j == 1 || j == toCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // move to next line
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(6, 6);
    }
}
