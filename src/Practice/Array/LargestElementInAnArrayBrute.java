package Practice.Array;

import java.util.Arrays;

public class LargestElementInAnArrayBrute
{
    public static void main(String[] args)
    {
        int[] arr={3,2,1,5,2};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr)
    {
        Arrays.sort(arr);

        return arr[arr.length-1];
    }
}
