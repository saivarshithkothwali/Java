package Practice.Array;

public class longestConsecutiveSequenceBrute
{
    public static void main(String[] args)
    {
        int[] arr={102,4,100,1,101,3,2,1,1};
        System.out.println(longest(arr));
    }
    public static int longest(int[] arr)
    {
        int count=1;
        int maxCount=1;

        for(int i=0;i<arr.length;i++)
        {
            int el=arr[i];
            count=1;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==el+1)
                {
                    count++;
                    el=el+1;
                    j=0;
                }
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}
