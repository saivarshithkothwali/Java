package Practice.Array;

import java.util.Arrays;

public class MoveZeroesToEnd
{
    public static void main(String[] args)
    {
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        System.out.println(Arrays.toString(move(arr)));

    }
    public static int[] move(int[] arr)
    {
        int length=arr.length;
        int j=-1;
        for(int zero=0;zero<length;zero++)
        {
            if(arr[zero]==0)
            {
                j=zero;
                break;
            }

        }
        if(j==-1)
            return arr;

        for(int i=j+1;i<length;i++)
        {
            if(arr[i]!=0)
            {
                swap(arr,i,j);
                j++;
            }

        }
        return arr;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
