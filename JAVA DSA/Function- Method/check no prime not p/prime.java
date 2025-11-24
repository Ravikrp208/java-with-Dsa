public class prime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // handle 0, 1, negatives

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;  // <-- Missing in your code
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12)); // false
    }
}
