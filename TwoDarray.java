import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of rows and columns
        System.out.print("Please enter the number of rows: ");
        int r = input.nextInt();

        System.out.print("Please enter the number of columns: ");
        int c = input.nextInt();

        // Declare 2D array
        int[][] arr = new int[r][c];

        // Prompt for array elements
        System.out.println("\nEnter the elements of the array:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter value for arr[" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
