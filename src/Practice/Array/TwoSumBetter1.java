package Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumBetter1
{
    public static void main(String[] args)
    {
        int[] arr={2,6,5,8,11};
        int target=14;
        System.out.println(sum(arr,target));
    }
    public static boolean sum(int[] arr,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int required=target-arr[i];
            if(map.containsKey(required))
            {
                return true;
            }
            else
            {
                map.put(arr[i],i);
            }

        }
        return false;
    }
}
