import java.util.Scanner;
public class sumofnnumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1 ;i<=n;i++){
            sum +=i;}
            System.out.println("the sum of "+ n + " natural numbers is " +sum);
            
        
    }
}



// create array list and add n natural numbers
// import java.util.Scanner;

// public class sumofnnumbers {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter how many numbers you want to sum: ");
//         int n = input.nextInt();
        
//         int[] numbers = new int[n];
//         int sum = 0;

//         System.out.println("Enter " + n + " numbers:");
//         for(int i = 0; i < n; i++) {
//             numbers[i] = input.nextInt();
//             sum += numbers[i];
//         }

//         System.out.println("Sum of the numbers: " + sum);
//     }
//  }

