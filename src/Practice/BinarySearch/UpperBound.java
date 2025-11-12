package Practice.BinarySearch;

public class UpperBound
{
    public static void main(String[] args) {
        int[] arr={2,3,6,7,8,8,11,11,11,12};
        System.out.println(upper(arr,12));
    }
    public static int upper(int[] arr,int x)
    {
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>x)
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
}
