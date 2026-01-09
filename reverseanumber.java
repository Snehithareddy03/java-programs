import java.util.Scanner;
public class reverseanumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        int n = input.nextInt();
        int original = n;
        int rev = 0;
        while (n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println("Sum of digits in "+ original + " is " + rev);
            
        
    }
}