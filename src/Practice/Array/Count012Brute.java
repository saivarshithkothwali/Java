package Practice.Array;

import java.util.Arrays;

public class Count012Brute
{
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,2,1,0,0,1,1,2};

        System.out.println(Arrays.toString(sum(arr)));
    }
    public static int[] sum(int[] arr)
    {
        int count1=0,count2=0,count0=0;
        for(int el:arr)
        {
            if(el==0)
                count0++;
            if(el==1)
                count1++;
            if(el==2)
                count2++;
        }
        for(int i=0;i<count0;i++)
        {
            arr[i]=0;
        }
        for(int i=count0;i<count0+count1;i++)
        {
            arr[i]=1;
        }
        for(int i=count0+count1;i<arr.length;i++)
        {
            arr[i]=2;
        }
        return  arr;
    }
}
