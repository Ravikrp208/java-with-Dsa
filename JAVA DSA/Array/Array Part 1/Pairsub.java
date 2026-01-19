//print subarrays //
// a continuous part of array //

public class Pairsub {

    public static void printSub(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print karne ke liye
                    System.out.print(numbers[k] + " ");
                }
                System.out.println(); // new line after each subarray
            }
            System.out.println(); //gap ke liye
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSub(numbers);
    }
}
