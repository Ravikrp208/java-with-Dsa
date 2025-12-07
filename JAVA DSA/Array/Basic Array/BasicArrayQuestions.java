public class BasicArrayQuestions {

    public static void main(String[] args) {

        int[] arr = {10, 5, 40, 20, 20};

        // 1. Largest element
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
        }
        System.out.println("Largest: " + largest);

        // 2. Smallest element
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) smallest = num;
        }
        System.out.println("Smallest: " + smallest);

        // 3. Count even & odd
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);

        // 4. Sum of array
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);

        // 5. Linear Search
        int search = 20;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }
        System.out.println("Search " + search + " found at index: " + index);

        // 6. Reverse array
        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 7. Count frequency of a number
        int freqNum = 20, count = 0;
        for (int num : arr) {
            if (num == freqNum) count++;
        }
        System.out.println("Frequency of " + freqNum + ": " + count);

        // 8. Second largest element
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        System.out.println("Second Largest: " + max2);

        // 9. Copy array
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.print("Copied Array: ");
        for (int num : copy) System.out.print(num + " ");
        System.out.println();

        // 10. Check if sorted
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Is array sorted? " + sorted);
    }
}
