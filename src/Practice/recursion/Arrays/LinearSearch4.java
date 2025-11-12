package Practice.recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch4
{
    public static void main(String[] args)
    {
        int[] arr={3,2,4,6,18,18,9};
        int target=18;
        System.out.println(LS(arr,target,0,new ArrayList<>()));
    }
    public static ArrayList<Integer> LS(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return LS(arr,target,index+1,list);
    }
}
