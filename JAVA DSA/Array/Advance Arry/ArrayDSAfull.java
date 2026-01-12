import java.util.Scanner;

public class ArrayDSAfull {

    // Sum of array
    static void sum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }

    // Max element
    static void max(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        System.out.println("Maximum = " + max);
    }

    // Min element
    static void min(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min)
                min = x;
        }
        System.out.println("Minimum = " + min);
    }

    // Reverse array
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed Array: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // Linear Search
    static void search(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not found");
    }

    // Second Largest
    static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }
        System.out.println("Second Largest = " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sum(arr);
        max(arr);
        min(arr);
        reverse(arr);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        search(arr, key);

        secondLargest(arr);

        sc.close();
    }
}
