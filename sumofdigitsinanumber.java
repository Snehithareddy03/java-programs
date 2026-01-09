import java.util.Scanner;
public class sumofdigitsinanumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits in "+ original + " is " + sum);
            
        
    }
}