package Practice.sorting;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr={3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<=arr.length-i-1;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j-1,j);
                    swapped=true;
                }

            }

            if(swapped==false)
                break;
        }
    }
    public static void swap(int[] arr,int a,int b)
    {
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;


    }
}
