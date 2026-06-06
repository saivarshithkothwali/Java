package Practice.BinarySearch;

public class LowerBound
{
    public static void main(String[] args) {
        int[] arr={3,5,8,15,19};
        System.out.println(lower(arr,20));
    }
    public static int lower(int[] arr,int x)
    {


        int s=0,e=arr.length-1;
        int lb=arr.length;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>=x)
            {
                lb=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return lb;

    }
}
