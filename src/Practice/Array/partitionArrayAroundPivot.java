package Practice.Array;

import java.util.Arrays;

public class partitionArrayAroundPivot
{
    public static void main(String[] args) {
        int[] arr={19,18,7,26,5};
        int pivot=7;
        partition(arr,pivot);
    }
    public static void partition(int[] arr,int pivot)
    {
        int s=0,middle=0;
        int e=arr.length-1;

        while(middle<=e)
        {
            if(arr[middle]>pivot)
            {
                swap(arr,middle,e);
                e--;
            }
            else if(arr[middle]<pivot)
            {
                swap(arr,middle,s);
                s++;
                middle++;
            }
            else
            {
                middle++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;

    }

}
