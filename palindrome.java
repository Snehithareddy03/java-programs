import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter the number:");
        int num = in.nextInt();
        int rev = 0;
        int original=num;
        while (num>0){
            rev = rev*10+num%10;
            num=num/10;
        }
        if (original==rev)
        System.out.println(original+" is a palindrome number");
        else
        System.out.println(original+" is not  a palindrome number");
    }
}