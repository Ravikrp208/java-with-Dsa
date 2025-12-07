// matrix of arry
public class Simple2DArray{
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("2D Array Elements:");

        // Print 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
