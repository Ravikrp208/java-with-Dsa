// package JAVA DSA.Array.Array Part 1;

// package JAVA DSA.Array with liner search ;

public class LinearSearch {
    public static void main(String[] args) 
    {

        int[] arr = {10, 25, 30, 45, 50};
        int target = 30;

        int index = linearSearch(arr, target);

        if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }

    public static int linearSearch(int[] arr, int target) 
    {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;  
            }
        }
        return -1;  // Not found
    }
}
