package Practice.Array;
import java.util.Arrays;

public class TwoSumOptimal
{
    public static void main(String[] args)
    {
        int[] arr={2,6,5,8,11};
        int target=14;
        System.out.println(sum(arr,target));
    }
    public static boolean sum(int[] arr,int target)
    {
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while(l<r)
        {
            if(arr[l]+arr[r]<target)
            {
                l++;
            }
            else if(arr[l]+arr[r]>target)
            {
                r--;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
