package Practice.BinarySearch;

public class MinInRotatedSortedArray
{
    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(min(arr));
    }
    public static int min(int[] arr)
    {
        int s=0,e=arr.length-1;
        int minimum=arr[0];

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[s]<=arr[mid])
            {
                minimum=Math.min(arr[s],minimum);
                s=mid+1;
            }
            else
            {
                minimum=Math.min(arr[mid],minimum);
                e=mid-1;
            }
        }
        return minimum;
    }
}
