package Practice.BinarySearch2D;

public class MedianInRowWiseSortedArray
{
    public static void main(String[] args) {
        int[][] arr={{1,3,5},{2,6,9},{3,6,9}};
        System.out.println(median(arr));


    }
    public static int median(int[][] arr)
    {


        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]<low)
            {
                low=arr[i][0];
            }
            if(arr[i][arr[i].length-1]>high)
            {
                high=arr[i][arr[i].length-1];
            }
        }


        int required=(arr.length*arr[0].length)/2;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int count=0;
            for(int i=0;i<arr.length;i++)
            {
                int s=0,e=arr[i].length-1;
                while(s<=e)
                {
                    int m=s+(e-s)/2;

                    if(arr[i][m]<=mid)
                    {
                        s=m+1;
                    }
                    else
                    {
                        e=m-1;
                    }
                }
                count=count+s;
            }
            if(count<=required)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;

    }
}
