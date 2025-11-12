package Practice.BinarySearch;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FirstAndLastOccuranceBrute
{
    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,8,8,8,10,12};
        System.out.println(occurance(arr,8));

    }
    public static List<Integer> occurance(int[] arr,int target)
    {
        int first=-1,last=-1;
        //List<Integer> list=new ArrayList<>();
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
        //list.add();
        //list.addAll();
        return new ArrayList<>(Arrays.asList(first,last));
    }
}
