package Practice.BinarySearch;

public class Ceil
{
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25};
        System.out.println(ceilOfANumber(arr,27));
    }
    public static int ceilOfANumber(int[] arr,int target)
    {
        int ceil=-1;
        int s=0,e=arr.length-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>=target)
            {
                ceil=arr[mid];
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return ceil;
    }
}
