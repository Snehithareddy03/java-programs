import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean s = true;
        if(n<=1){
            s = false;
        }
        for (int i =2;i<=n/2;i++){
            if(n%i==0){
                s = false;
                break;
            }
        }
        if(s==true){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
    
}
