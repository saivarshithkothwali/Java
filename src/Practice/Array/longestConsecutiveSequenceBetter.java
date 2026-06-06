package Practice.Array;

import java.util.Arrays;

public class longestConsecutiveSequenceBetter
{
    public static void main(String[] args) {
        int[] arr={9,1,4,7,4,3,-1,0,5,100,101,8,-1,6};
        System.out.println(longest(arr));
    }
    public static int longest(int[] arr)
    {
        int count=1;
        int maxCount=1;

        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i]-1)
            {
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else if(arr[i-1]==arr[i])
            {
                continue;
            }
            else
            {
                count=1;
            }
        }
        return maxCount;
    }
}
