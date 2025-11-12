package Practice.Stack;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class NextSmallerElement
{
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nse(arr)));
    }
    public static int[] nse(int[] arr)
    {
        int[] temp=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            boolean found=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp[i]=arr[j];
                    found=true;
                    break;
                }
            }
            if(found==false)
                temp[i]=-1;
        }
        return temp;
    }


}
