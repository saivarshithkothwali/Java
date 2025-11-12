package Practice.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumBetter
{
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        System.out.println(Arrays.toString(sum(arr,target)));
    }
    public static int[] sum(int[] arr,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int required=target-arr[i];
            if(map.containsKey(required))
            {
                return new int[] {map.get(required),i};
            }
            else
            {
                map.put(arr[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
