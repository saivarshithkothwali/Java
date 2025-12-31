package Practice.sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last = arr.length - 1-i;
            int maxIndex = findMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }


    }
    public static int findMax(int[] arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int largest,int smallest)
    {
        int temp=arr[smallest];
        arr[smallest]=arr[largest];
        arr[largest]=temp;
    }
}
