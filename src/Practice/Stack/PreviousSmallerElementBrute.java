package Practice.Stack;

import java.util.Arrays;

public class PreviousSmallerElementBrute
{
    public static void main(String[] args) {
        int[] arr={4,5,2,10,8};
        System.out.println(Arrays.toString(smaller(arr)));
    }
    public static int[] smaller(int[] arr)
    {
        int[] temp=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            boolean found=false;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]<arr[i])
                {
                    temp[i]=arr[j];
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                temp[i]=-1;
            }

        }
        return temp;
    }
}
