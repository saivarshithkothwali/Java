package Practice.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccuranceBruteLBUB
{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,8,8,11,13};
        System.out.println(occurance(arr,12));
    }
    public static List<Integer> occurance(int[] arr, int target)
    {
        List<Integer> list=new ArrayList<>();
        int lb=LB(arr,target);
        int ub=UB(arr,target);
        if(lb==arr.length || arr[lb]!=target)
        {
            list.add(-1);
            list.add(-1);
            return list;
        }
        list.add(lb);
        list.add(ub-1);
        return list;
    }
    public static int LB(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return ans;
    }
    public static int UB(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>target)
            {
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }
}
