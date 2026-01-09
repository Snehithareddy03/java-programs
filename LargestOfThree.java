import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the three numbers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // if ((a >= b) && (a >= c)) {
        //     System.out.println(a + " is greater");
        // } else if ((b >= c) && (b >= a)) {
        //     System.out.println(b + " is greater");
        // } else {
        //     System.out.println(c + " is greater");
   // }

        int max = a;
        if (b>max){
            max = b;
        }
        if(c>max){
            max =c;

        }
        System.out.println(max);
    }
}
