import java.util.*;
public class addaelement {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var l = new ArrayList<>(List.of(1, 2, 3));
        l.add(s.nextInt(), s.nextInt());
        System.out.println(l);
    }
}
