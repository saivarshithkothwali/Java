package Practice.TwoPointerSlidingWindowPrefixSum;

public class MaximumConsecutiveOnes3Brute
{
    public static void main(String[] args)
    {
        int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(count(arr,3));
    }
    public static int count(int[] arr,int k)
    {
        //int count=0;
        int flips=0;
        int maxCount=0;

        for(int i=0;i<arr.length;i++)
        {
            //count=0;
            flips=0;
            for(int j=i;j<arr.length;j++)
            {

                if(arr[j]==0)
                {
                    if(flips<k)
                    {
                        flips++;

                    }
                    else
                    {

                        maxCount=Math.max(j-i,maxCount);
                        break;
                    }
                }
            }


        }
        return maxCount;
    }
}
