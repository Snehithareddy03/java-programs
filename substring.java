import java.util.Scanner;
class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i = start;i<end;i++){
            System.out.print(s.charAt(i));
        }
    }
    
}
