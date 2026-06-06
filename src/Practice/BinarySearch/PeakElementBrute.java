package Practice.BinarySearch;

public class PeakElementBrute
{
    public static void main(String[] args) {
        int[] arr={1,3,5,7,6,4,2};
        System.out.println(peak(arr));
    }
    public static int peak(int[] arr)
    {
        if(arr.length==1)
        {
            return arr[0];
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(arr[i]>arr[i+1])
                {
                    return arr[i];
                }

            }

            else if((i==arr.length-1))
            {
                if(arr[i]>arr[i-1])
                {
                    return arr[i];
                }

            }

            else
            {
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
