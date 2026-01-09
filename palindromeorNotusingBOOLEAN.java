import java.util.Scanner;
class palindromeorNotusingBOOLEAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a string:");
        String str = input.nextLine();
        Boolean isPalindrome = true;
        for(int i =0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}