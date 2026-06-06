package Practice.Array;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionBrute
{
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
        System.out.println(union(arr1,arr2));

    }
    public static ArrayList<Integer> union(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int el:arr1)
        {
            set.add(el);

        }
        for(int el:arr2)
        {
            set.add(el);
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int el:set)
        {
            list.add(el);
        }
        return list;
    }
}
