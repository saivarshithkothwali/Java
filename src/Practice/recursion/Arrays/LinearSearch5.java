package Practice.recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch5
{
    public static void main(String[] args)
    {
        int[] arr={3,2,4,6,18,18,9};
        int target=18;
        System.out.println(LS(arr,target,0));
    }
    public static ArrayList<Integer> LS(int[] arr, int target, int index)
    {
        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length)
        {
            return list;
        }

        if(arr[index]==target)
        {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls= LS(arr,target,index+1);

         list.addAll(ansFromBelowCalls);
         return list;

    }
}
