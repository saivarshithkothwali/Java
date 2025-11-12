package Practice.recursion.Arrays;

public class RotatedBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr={7,8,9,1,2,3,4,5,6};
        int s=0;
        int e=arr.length-1;
        System.out.println(Find(arr,1,0,e));
    }
    public static int Find(int[] arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        }

        if(arr[mid]<=arr[e])
        {
            if(arr[mid]<=target && target<=arr[e])
            {
                return Find(arr,target,mid+1,e);
            }
            else
            {
                return Find(arr,target,s,mid-1);
            }
        }

        else
        {
            if(arr[s]<=target && target<=arr[mid])
            {
                return Find(arr,target,s,mid-1);
            }
            else
            {
                return Find(arr,target,mid+1,e);
            }

        }

    }
}
