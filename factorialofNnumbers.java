import java.util.Scanner;
public class factorialofNnumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        int n = input.nextInt();
        int fact = 1;
        for(int i = 1 ;i<=n;i++){
            fact *=i;}
            System.out.println("the factorial of "+ n + " natural numbers is " +fact);
            
        
    }
}