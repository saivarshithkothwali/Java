package Practice.Array;

import java.util.Arrays;

public class rearrangeArrayElementsBySignBrute
{
    public static void main(String[] args)
    {
        int[] arr={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(arr)));

    }
    public static int[] rearrange(int[] arr)
    {
        int[] pos=new int[arr.length/2];
        int[] neg=new int[arr.length/2];
        int i=0,j=0;

        for(int el:arr)
        {
            if(el>0)
            {
                pos[i]=el;
                i++;
            }
            else if(el<0)
            {
                neg[j]=el;
                j++;
            }
        }


        i=0;
        j=0;
        for(int k=0;k<arr.length;k++)
        {
            if(k%2==0)
            {
                arr[k]=pos[i];
                i++;
            }
            else
            {
                arr[k]=neg[j];
                j++;
            }
        }

        return arr;
    }
}
