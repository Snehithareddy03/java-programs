import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a string:");
        String x=input.nextLine();
        String reversed="";
        for(int i =x.length()-1;i>=0;i--){
            reversed+=x.charAt(i);
        }
        
        if (x.equals(reversed)){
            System.out.println("true");
        }
        else {
System.err.println("false");
}    
}
    
}
