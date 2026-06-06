package Practice.Stack;

import java.util.Arrays;

public class NextGreaterElementBrute
{
    public static void main(String[] args) {
        int[] arr={2,1,7,11,12,3,6,9};
        System.out.println(Arrays.toString(nge(arr)));
    }
    public static int[] nge(int[] arr)
    {
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            boolean found=false;
            for(int j=i+1;j<arr.length;j++)
            {
                int curr=arr[i];

                if(arr[j]>curr)
                {
                    found=true;
                    ans[i]=arr[j];
                    break;
                }
            }
            if(found==false)
            {
                ans[i]=-1;
            }
        }
        return ans;
    }
}
