import java.util.Arrays;
public class repeatnumber {
    public static void main(String[] args) {
        int [] arr ={1,2,3,5,1,6,7,2,8,3,2};
        Arrays.sort(arr);
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i] == arr[i+1]){
                count ++;
            }
            else{
                System.out.println(arr[i] + " occurs " + count + " times");
                count =1;
            }
        }
    }
}
