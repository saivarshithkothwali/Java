package Practice.BinarySearch;

public class CountOccurances
{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,8,8,8,10,12};
        System.out.println((count(arr,8)));
    }
    public static int count(int[] arr,int target)
    {
        int first=-1;
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                first=mid;
                e=mid-1;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }

        int last=-1;
         s=0;
         e=arr.length-1;
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
            else
            {
                s=mid+1;
            }
        }
        return (last-first+1);
    }
}
