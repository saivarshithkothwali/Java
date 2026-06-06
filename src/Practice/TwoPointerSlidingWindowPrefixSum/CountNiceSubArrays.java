package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashMap;

public class CountNiceSubArrays
{
    public static void main(String[] args) {
        int[] arr={2,2,2,1,2,2,1,2,2,2};
        System.out.println(count(arr,2));
    }
    public static int count(int[] arr,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefixSum=0;

        for(int i=0;i<arr.length;i++)
        {

            prefixSum=prefixSum+(arr[i]%2);

            if(map.containsKey(prefixSum-k))
            {
                count = count + map.get(prefixSum - k);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
}
