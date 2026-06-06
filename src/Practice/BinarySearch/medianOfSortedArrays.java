package Practice.BinarySearch;

public class medianOfSortedArrays
{
    public static void main(String[] args)
    {
        int[] arr1={1,2,3};
        int[] arr2={100,200,300};

        System.out.println(median(arr1,arr2));
    }
    public static double median(int[] arr1,int[] arr2)
    {
        if(arr1.length>arr2.length)
        {
            return median(arr2,arr1);
        }

        int totalLength=arr1.length+arr2.length;

        int right=totalLength/2;
        int left=totalLength-right;

        int s=0;
        int e=arr1.length;

        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int cut1=mid;
            int cut2=left-mid;

            int l1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];

            int r1=(cut1==arr1.length)?Integer.MAX_VALUE:arr1[cut1];
            int r2=(cut2==arr2.length)?Integer.MAX_VALUE:arr2[cut2];

            if(l1<=r2 && l2<=r1)
            {
                if(totalLength%2==0)
                {
                    int mid1=Math.max(l1,l2);
                    int mid2=Math.min(r1,r2);

                    return (mid1+mid2)/(double)2;
                }
                else
                {
                    return (double)Math.max(l1,l2);
                }
            }
            else if(l2>r1)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;

    }
}
