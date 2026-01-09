import java.util.Scanner;
public class countofOccurence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n[]= {1,2,2,4,3,5,6,7,2};
        int count = 0;
        System.out.print("enter the value:");
        int target = input.nextInt();
        for(int i =0;i< n.length;i++){
            if(n[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
