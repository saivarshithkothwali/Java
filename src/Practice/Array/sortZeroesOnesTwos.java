package Practice.Array;

import java.util.Arrays;

public class sortZeroesOnesTwos
{
    public static void main(String[] args) {
        int[] arr={0};
        sort(arr);
    }
    public static void sort(int[] arr)
    {
        int s=0,mid=0;
        int e=arr.length-1;

        while(mid<=e)
        {

            if(arr[mid]==2)
            {
                swap(arr,mid,e);
                e--;
            }
            else if(arr[mid]==0)
            {
                swap(arr,s,mid);
                s++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

//    public static void sort(int[] arr)
//    {
//        int s=0,e=arr.length-1;
//        int mid=s+(e-s)/2;
//
//        while(mid<=e)
//        {
//            if(arr[mid]==0)
//            {
//                swap(arr,mid,s);
//                s++;
//            }
//            else if(arr[mid]==1)
//            {
//                mid++;
//            }
//            else{
//                swap(arr,mid,e);
//                e--;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    public static void swap(int[] arr,int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;

    }

}
