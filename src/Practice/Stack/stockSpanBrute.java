package Practice.Stack;

import java.util.Arrays;

public class stockSpanBrute
{
    public static void main(String[] args) {
        int[] arr={7,2,1,2};
        System.out.println(Arrays.toString(span(arr)));
    }
    public static int[] span(int[] arr)
    {
        int[] temp=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            int span=0;

            for(int j=i;j>=0;j--)
            {
                if(arr[j]<=arr[i])
                {
                    span++;
                }
                else {
                    break;
                }
            }
            temp[i]=span;
        }
        return temp;
    }
}
