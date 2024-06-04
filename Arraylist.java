import java.util.*;

public class Arraylist{
public static void main(String[] args) {
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<Integer> l2 = new ArrayList<>(5);
    l2.add(49);
    l2.add(67);
    l1.add(23);
    l1.add(45);
    l1.add(23);
    l1.add(0,47);
    l1.addAll(0,l2);
    System.out.println(l1.contains(34));
    System.out.println(l1.indexOf(45));
    for(int i = 0; i<l1.size(); i++){
        System.out.print(l1.get(i));
        System.out.print(", ");
    }
}
}