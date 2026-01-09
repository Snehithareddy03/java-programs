import java.util.Scanner;
class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value:");
        char ch = input.next().trim().charAt(0);
        if (ch>='a'&& ch<='z'){
            System.out.println("the letter given is lower case");
        }
        else if  (ch>='A'&& ch <='Z'){
            System.out.println("the letter given is upper case");
        }else{
            System.out.println("invalid input");
            
        }
        
    }
}