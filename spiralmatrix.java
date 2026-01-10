class spiralmatrix {
    public static void main(String[] args) {
        int [][] m = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
        };
        int rows =5;
        int cols =4;
        int top=0,bottom=rows-1;
        int left =0,right =cols-1;
        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++)
                System.out.print(m[top][i]+ " ");
            top++;
            for(int i =top;i<=bottom;i++)
                System.out.print(m[i][right]+" ");
            right--;
        
        if(top<=bottom && left<=right){
            for(int i = right;i>=left;i--)
                System.out.print(m[bottom][i]+" ");
            bottom--;

            for(int i = bottom;i>=top;i--)
                System.out.print(m[i][left]+" ");
            left++;
        } 
        }
    }
}


