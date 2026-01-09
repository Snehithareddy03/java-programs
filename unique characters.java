import java.util.*;

class Main{
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("one");
        t1.add("two");
        t1.add("three");
        t1.add("four");
        t1.add("five");
        System.out.println("contents of treeset");
        Iterator it1=t1.iterator();
        while(it1.hasNext()){
        Object o1=it1.next();
        System.out.println(o1+ "\t");
    }
}
}


    
