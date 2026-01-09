import java.util.Scanner;
public class countofaNUMBER{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number:");
       int n = in.nextInt();
       System.out.print("enter a number:");
       int x = in.nextInt();
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == x){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}