package Practice.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccuranceOptimal
{
    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,8,8,8,10,12};
        System.out.println((occurance(arr,8)));
    }
    public static List<Integer> occurance(int[] arr,int target)
    {
        //List<Integer> list=new ArrayList<>();

//        list.add(firstOccurance(arr,target));
//        list.add(lastOccurance(arr,target));

        return List.of(firstOccurance(arr,target),lastOccurance(arr,target));


    }
    public static int firstOccurance(int[] arr,int target)
    {
        int first=-1;

        int s=0,e=arr.length-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>target)
            {
                e=mid-1;
            }
            else if(arr[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                first=mid;
                e=mid-1;
            }

        }
        return first;
    }

    public static int lastOccurance(int[] arr,int target)
    {
        int last=-1;

        int s=0,e=arr.length-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]==target)
            {
                last=mid;
                s=mid+1;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return last;
    }
}
