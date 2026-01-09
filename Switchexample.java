import java.util.Scanner;
class Switchexample {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("please enter a fruit name");
       String fruit = input.next().toLowerCase();
       
       switch (fruit){
           case "mango" -> System.out.println("king of all fruits");
           case "apple" -> System.out.println("big red fruits");
           case "orange" -> System.out.println("the sour fruits");
           default -> System.out.println("enter a valid fruit name");
           
       }
    }
}
+;