package Practice.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement2Better
{
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majority(arr));
    }
    public static ArrayList<Integer> majority(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int el:arr)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }

        for(int key:map.keySet())
        {
            if(map.get(key)>arr.length/3)
            {
                list.add(key);
            }
        }
        return list;
    }
}
