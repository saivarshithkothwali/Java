package Practice.BinarySearch;

import java.util.Arrays;

public class FirstAndLAstOccuranceBrute1
{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,8,8,11,13};
        System.out.println(Arrays.toString(occurance(arr,8)));
    }
    public static int[] occurance(int[] arr,int target)
    {
        int first=-1,last=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                if(first==-1)
                {
                    first=i;
                }
                last=i;
            }
        }
        return new int[] {first,last};
    }

}
