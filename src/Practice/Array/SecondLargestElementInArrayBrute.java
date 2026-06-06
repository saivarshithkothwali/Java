package Practice.Array;

import java.util.Arrays;

public class SecondLargestElementInArrayBrute
{
    public static void main(String[] args) {
        int[] arr={-1,-2,-4,-7,-7,5};
        System.out.println(secondLragest(arr));
    }
    public static int secondLragest(int[] arr)
    {
        Arrays.sort(arr);

        int largest=arr[arr.length-1];
        //int secondLargest=-1;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<largest)
            {
                secondLargest=arr[i];
                break;
            }
        }
        if(secondLargest==Integer.MIN_VALUE)
        {
            return -1;

        }
        return secondLargest;
    }
}
