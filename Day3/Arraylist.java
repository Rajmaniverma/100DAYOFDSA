package Day3;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(9);
    System.out.println(l1);
    System.out.println( l1.indexOf(3));
    System.out.println(l1.remove(Integer.valueOf(8))); 
    System.out.println(l1); 
    System.out.println(l1.size());
    l1.add(2,200);
    System.out.println(l1);
    l1.set( 3 , 102 );
    System.out.println(l1);
    l1.remove(2);
    boolean ans = l1.contains(Integer.valueOf(9));
    System.out.println(ans);



    }
}
