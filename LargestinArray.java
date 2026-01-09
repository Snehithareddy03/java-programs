class LargestinArray {
    public static void main(String[] args) {
        int[] x ={1,2,3,66,78,34};
        int max = x[0];
        for (int i=0;i<x.length;i++){
            if (x[i]>max){
                max=x[i];
            }
        }
        System.out.println("the largest number in array is:" +max );
    }
}