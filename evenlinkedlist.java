// CREATE A LINKED LIST AND PRINT EVEN NUMBERS
import java.util.*;
public class evenlinkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList <>();
        for (int i = 2;i <=10;i+=2)
        list.add(i);
        System.out.println(list);
    }   
}
