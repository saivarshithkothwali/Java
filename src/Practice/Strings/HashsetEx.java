package Practice.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.TreeSet;

public class HashsetEx
{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        TreeSet<Integer> set1 = new TreeSet<>();      // sorted
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(); // preserves insertion order

        set.add(3);
        set.add(98);
        set.add(50);
        set.add(100);
        set.add(78);

        set1.add(3);
        set1.add(98);
        set1.add(50);
        set1.add(100);
        set1.add(78);

        set2.add(3);
        set2.add(98);
        set2.add(50);
        set2.add(100);
        set2.add(78);

        System.out.println("HashSet: "+set);

        System.out.println("TreeSet: " +set1);

        System.out.println("LinkedHashSet: " +set2);


    }
}
