class Main{
    public static void main(String[] args){
        String s = "SnehiTHA";
        s=s.toLowerCase();
        int evenc = 0;
        int oddc = 0;
        for(int i =0;i<=s.length()-1;i++){
            if(s.charAt(i) == 'a'||s.charAt(i) =='e'||s.charAt(i) =='i'||s.charAt(i) =='o'||s.charAt(i) =='u'){
                evenc=evenc+1;
            }
            else{
                oddc = oddc+1;
            }
        }
        System.out.println(evenc);
        System.out.print(oddc);
    }
}