package Practice.sorting;

import java.util.Arrays;

public class BubbleSortRecursive
{
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        sort(arr,0,1,false);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int i,int j,boolean swapped)
    {
        if(i==arr.length-1)
        {
            return;
        }

        if(j<=arr.length-i-1)
        {
            if(arr[j]<arr[j-1])
            {
                swap(arr,j,j-1);
                swapped=true;
            }
            sort(arr,i,j+1,swapped);

        }
        else
        {
            if(swapped==false)
            {
                return;
            }
            sort(arr,i+1,1,false);
        }
    }
    public static void swap(int[] arr,int right,int left)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

    }

}
