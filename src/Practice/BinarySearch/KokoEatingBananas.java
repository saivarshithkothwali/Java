package Practice.BinarySearch;

public class KokoEatingBananas
{
    public static void main(String[] args)
    {
        int[] arr={3,6,7,11};
        System.out.println(minDays(arr,8));

    }
    public static int minDays(int[] arr,int h)
    {
        int start=1;
        int end=maximum(arr);
        int ans=maximum(arr);

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int totalTime=timeTaken(arr,mid);

            if(totalTime<=h)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return ans;

    }
    public static int timeTaken(int[] arr,int mid)
    {
        int totalTimeTaken=0;
        for(int i=0;i<arr.length;i++)
        {
            totalTimeTaken+=Math.ceil((double)arr[i]/mid);
        }
        return totalTimeTaken;
    }
    public static int maximum(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
