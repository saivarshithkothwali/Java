package Practice.Array;

import java.util.Arrays;

public class MoveZeroesToEndBrute
{
    public static void main(String[] args)
    {
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        System.out.println(Arrays.toString(move(arr)));

    }
    public static int[] move(int[] arr)
    {
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }

        for(int i=j;i<temp.length;i++)
        {
            temp[i]=0;
        }
        return temp;
    }

}
