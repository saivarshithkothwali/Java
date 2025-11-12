package Practice.Array;

import java.util.Arrays;

public class RearrangeArrayElementsBySignBrute
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
        int posIndex=0;
        int negIndex=0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]>0)
            {
                pos[posIndex]=arr[i];
                posIndex++;
            }
            if(arr[i]<0)
            {
                neg[negIndex]=arr[i];
                negIndex++;
            }
        }

        for(int i=0;i<arr.length/2;i++)
        {
            arr[i*2]=pos[i];
            arr[(i*2)+1]=neg[i];
        }
        return arr;
    }
}
