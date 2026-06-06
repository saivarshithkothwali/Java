package Practice.Array;

import java.sql.Array;
import java.util.ArrayList;

public class MajorityElement2Optimal
{
    public static void main(String[] args) {
        int[] arr={1,3,2,1,2,1,2};
        System.out.println(majority(arr));
    }
    public static ArrayList<Integer> majority(int[] arr)
    {
        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==el1 )
            {

                count1++;
            }
            else if(arr[i]==el2)
            {
                count2++;
            }
            else if(count1==0 && el2!=arr[i])
            {
                el1=arr[i];
                count1++;
            }
            else if(count2==0 && el1!=arr[i])
            {
                el2=arr[i];
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int el:arr)
        {
            if(el==el1)
            {
                count1++;
            }
            if(el==el2)
            {
                count2++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();

        if(count1>arr.length/3)
        {
            list.add(el1);
        }
        if(count2>arr.length/3)
        {
            list.add(el2);
        }

        return list;
    }
}
