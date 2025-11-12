package Practice.recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch3
{
     static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args)
    {
        int[] arr={3,2,4,6,18,18,9};
        int target=18;
        LS(arr,target,0);
        System.out.println(list);
    }
    public  static void LS(int[] arr,int target,int index)
    {
        if(index==arr.length-1)
        {
            return;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        LS(arr,target,index+1);
    }
}
