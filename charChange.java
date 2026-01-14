import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c >= 'a' && c<= 'z'){
            System.out.print((char)(c-32));
        }
        else if (c>='A' && c<='Z'){
            System.out.println((char)(c+32));
        }
        sc.close();
    }
}