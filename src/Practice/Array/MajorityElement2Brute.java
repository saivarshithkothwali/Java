package Practice.Array;

import java.util.ArrayList;

public class MajorityElement2Brute
{
    public static void main(String[] args)
    {
        int[] arr={3,2,3,2,2};
        System.out.println(majority(arr));
    }
    public static ArrayList<Integer> majority(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>arr.length/3)
            {
                if(!list.contains(arr[i]))
                {
                    list.add(arr[i]);
                }

            }
        }
        return list;
    }
}
