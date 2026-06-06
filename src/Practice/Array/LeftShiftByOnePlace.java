package Practice.Array;

import java.util.Arrays;

public class LeftShiftByOnePlace
{
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(Arrays.toString(leftShift(arr)));
    }
    public static int[] leftShift(int[] arr)
    {

        int last=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=last;
        return arr;
    }
}
