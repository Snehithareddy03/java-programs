import java.util.Scanner;
class MethodfunctionSUM {
    public static void main(String[] args) {
        int result1 = sum();
        int result2 = sum();
        int result3 = sum();

        System.out.println("Sum 1: " + result1);
        System.out.println("Sum 2: " + result2);
        System.out.println("Sum 3: " + result3);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int num1 = in.nextInt();
        System.out.print("enter 2nd number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }
}