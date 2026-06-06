package Practice.Array;

import java.util.Arrays;

public class MoveZeroesToEnd1
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(move(arr)));
    }
    public static int[] move(int[] arr)
    {
        int i=-1;
        for(int in=0;in<arr.length;in++)
        {
            if(arr[in]==0)
            {
                i=in;
                break;
            }
        }
        if(i==-1)
        {
            return arr;
        }

        if(i==arr.length-1 || i==arr.length)
        {
            return arr;
        }
        int j=i+1;

        while(j<arr.length)
        {
            if(arr[i]==0 && arr[j]==0)
            {
                j++;
            }
            else if(arr[j]!=0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return arr;


    }
    public static void swap(int[] arr,int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
