package Practice.BinarySearch;

public class MinInRotatedSortedArray1
{
    public static void main(String[] args)
    {
        int[] arr={3,1,2};
        System.out.println(min(arr));
    }
    public static int min(int[] arr)
    {
        int s=0,e=arr.length-1;

        while(s<e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>arr[e])
            {
                s=mid+1;
            }
            else// arr[mid]>=arr[e]
            {
               e=mid;
            }
        }
        return arr[s];
    }
}
