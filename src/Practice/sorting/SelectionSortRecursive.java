package Practice.sorting;

import java.util.Arrays;

public class SelectionSortRecursive
{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int last)
    {
        if(last==0)
        {
            return;
        }

       if(last>0)
       {
           int maxIndex = findMax(arr, 0, last);
           swap(arr, maxIndex, last);

           sort(arr,last-1);
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
