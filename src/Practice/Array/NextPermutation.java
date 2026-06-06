package Practice.Array;

import java.util.Arrays;

public class NextPermutation
{
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1,0};
        System.out.println(Arrays.toString(next(arr)));

    }
    public static int[] next(int[] arr)
    {
        int index=-1;

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index=i;
                break;

            }
        }

        if(index==-1)
        {
            rev(arr,0,arr.length-1);
            return arr;
        }

        for(int i=arr.length-1;i>index;i--)
        {
            if(arr[i]>arr[index])
            {
                swapEl(arr,index,i);
                break;
            }
        }

        rev(arr,index+1,arr.length-1);
        return arr;
    }

    public static void swapEl(int[] arr,int index,int i)
    {
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }

    public static void rev(int[] arr,int s,int e)
    {
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
