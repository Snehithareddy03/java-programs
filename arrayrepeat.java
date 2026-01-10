class Main{
    public static void main(String [] args){
        //String s = "aabbbcccc";
        String [] s = {"a","a","b","b","b","c","c"};
        int count = 1;
        for(int i = 0;i<s.length-1;i++){
            if(s[i].equals(s[i+1])){
                count++;
            }
            else{
                System.out.print(s[i]+""+ count);
                count =1;
            }
        }
         System.out.print(s[s.length-1]+""+count);
    }
}