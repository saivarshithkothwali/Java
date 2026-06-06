package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashMap;

public class LongestSubarrayWithSumKPosNegZeros
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,1,1,1,1};
        System.out.println(longest(arr,5));
    }
    public static int longest(int[] arr,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixSum=0;
        int maxLength=0;

        for(int i=0;i<arr.length;i++)
        {
            prefixSum=prefixSum+arr[i];
            int find=prefixSum-k;

            if(map.containsKey(find))
            {
                maxLength=Math.max(maxLength,i-map.get(find));
            }
            if(!map.containsKey(prefixSum))
            {
                map.put(prefixSum,i);
            }

        }
        return maxLength;
    }
}
