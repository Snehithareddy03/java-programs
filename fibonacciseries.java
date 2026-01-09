import java.util.Scanner;
class fibonacciseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        int num = input.nextInt();
        int a =0,b=1;
        System.out.println("fibonaci series upto "+num);
        System.out.print(a+" "+b+" ");
        
        for(int i=3;i<=num;i++){
        int next = a+b;
        System.out.print(next+" ");
        a =b;
        b = next;
        
        }
        
    }
}