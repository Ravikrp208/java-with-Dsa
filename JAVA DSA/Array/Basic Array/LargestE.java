public class LargestE {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 7, 5};

        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        System.out.println("Largest element = " + max);
    }
}
