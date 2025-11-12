package Practice.Array;

import java.util.Arrays;

public class ProdOfArrayExceptItself
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(prod(arr)));
    }
    public static int[] prod(int[] arr)
    {
        int[] nums=new int[arr.length];
        int prod=1;
        for(int el:arr)
        {
            prod=prod*el;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=prod/arr[i];
        }
        return nums;
    }
}
