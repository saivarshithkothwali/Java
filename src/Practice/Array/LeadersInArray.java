package Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInArray
{
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        System.out.println(leaders(arr));
    }
    public static ArrayList<Integer> leaders(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();

        int max=arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
