package Practice.BinarySearch;

public class PeakElementOptimal
{
    public static void main(String[] args) {
        //int[] arr={1,3,5,7,9,8,6,4,2};
        int[] arr={5,4,3,2,1};
        System.out.println(peak(arr));
    }
    public static int peak(int[] arr)
    {
        int n=arr.length;

        if(n==1)
        {
            return arr[0];
        }

        if(arr[0]>arr[1])
        {
            return arr[0];
        }
        if(arr[n-1]>arr[n-2])
        {
            return arr[n-1];
        }

        int s=1,e=n-2;

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return arr[mid];
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
            {
                e=mid-1;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            {
                s=mid+1;
            }
        }
        return -1;
    }
}
