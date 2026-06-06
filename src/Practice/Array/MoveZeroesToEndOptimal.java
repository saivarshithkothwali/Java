package Practice.Array;

import java.util.Arrays;

public class MoveZeroesToEndOptimal
{
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,1};
        System.out.println(Arrays.toString(moveZeroesAndReturnArray(arr)));
    }
    public static int[] moveZeroesAndReturnArray(int[] arr)
    {
        int left=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                left=i;
                break;
            }
        }
        if(left==-1)
        {
            return arr;
        }
        int right=left+1;

        while(right<arr.length)
        {
            if(arr[right]!=0)
            {
                swap(arr,left,right);
                left++;
                right++;
            }
            else {
                right++;
            }


        }
        return arr;
    }
    public static void swap(int[] arr,int zero,int nonzero)
    {
        int temp=arr[zero];
        arr[zero]=arr[nonzero];
        arr[nonzero]=temp;
    }
}
