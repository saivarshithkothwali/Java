package Practice.slidingWindow;

public class BinarySubarrayWithSumOptimal
{
    public static void main(String[] args)
    {
        int[] arr={1,0,0,1,1,0};
        int goal=2;
        System.out.println(count(arr,goal)-count(arr,goal-1));
    }
    public static int count(int[] arr,int goal)
    {
        if(goal<0)
        {
            return 0;
        }
        int sum=0;
        int count=0;
        int l=0,r=0;

        while(r<arr.length)
        {
            sum=sum+arr[r];

            if(sum>goal)
            {
                while(sum>goal)
                {
                    sum=sum-arr[l];
                    l++;
                }
            }

            if(sum<=goal)
            {
                count=count+(r-l+1);
            }
            r++;
        }
        return count;
    }
}
