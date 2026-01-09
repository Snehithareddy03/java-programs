import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans =0;
        while(true){
        System.out.print("enter the operator: ");
        char op = input.next().trim().charAt(0);
        if (op=='+'|| op=='-'|| op=='*'||op=='/'|| op =='%'){
            System.out.println("enter the 2 numbers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            if (op=='+'){
                ans = a+b;
            }
            if  (op=='-'){
                ans = a-b;
            }
            if  (op=='*'){
                ans = a*b;
            }
            if  (op=='/'){
                if (b!=0){
                    ans = a/b;
                }
            }
            if  (op=='*'){
                ans = a*b;
            }
        }else if (op=='x'||op=='X'){
            break;
        }else{
            System.out.println("invalid operator");
        }
        System.out.println("therefore the answer is " + ans);
    }
}
    
}