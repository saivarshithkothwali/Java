package Practice.BinarySearch;

public class LowerBound
{
    public static void main(String[] args) {
        int[] arr={1,2,3,3,7,8,9,9,9,11};
        System.out.println(lower(arr,12));
    }
    public static int lower(int[] arr,int x)
    {
        int ans=arr.length;
        int s=0;
        int e=ans-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return ans;
    }
}
