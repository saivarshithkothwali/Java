package Practice.Array;

import java.util.Arrays;

public class MoveNegToEnd
{
    public static void main(String[] args) {
        int[] arr={2,-1,-2,-3,4,-5};
        move(arr);
    }
    public static void move(int[] arr)
    {
        int e=arr.length-1;
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            if(arr[i]<0)
//            {
//                e=i;
//                break;
//            }
//        }
        int s=0,middle=0;

        while(middle<=e)
        {
            if(arr[middle]>=0)
            {
                swap(arr,middle,e);
                e--;
            }
            else if(arr[middle]<0)
            {
                swap(arr,middle,s);
                s++;
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
