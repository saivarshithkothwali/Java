package Practice.BinarySearch;

public class NoOfTimesArrayRotated
{
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(count(arr));
    }
    public static int count(int[] arr)
    {
        int s=0,e=arr.length-1;

        while(s<e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>arr[e])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }
        return s;
    }
}
