package Practice.TwoPointerSlidingWindowPrefixSum;

//In this we should return thw total number of subarrrays whose sum equals k

import java.util.HashMap;

public class NoOfSubArraysWithSumKOptimal
{
    public static void main(String[] args) {
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(total(arr,3));
    }
    public static int total(int[] arr,int k)
    {
        int prefixSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;

        for(int el:arr)
        {
            prefixSum=prefixSum+el;

            int find=prefixSum-k;

            if(map.containsKey(find))
            {
                count=count+map.get(find);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

}
