package Practice.Array;

import java.util.Arrays;

public class LeftShiftByDBrute
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(leftShift(arr,8)));
    }
    public static int[] leftShift(int[] arr,int d)
    {
        d=d%arr.length;

        int[] last=new int[d];
        for(int i=0;i<d;i++)
        {
            last[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }

        int j=0;
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i]=last[j];
            j++;
        }
        return arr;
    }
}
