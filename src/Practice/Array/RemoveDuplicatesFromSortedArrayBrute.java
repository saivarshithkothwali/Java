package Practice.Array;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArrayBrute
{
    public static void main(String[] args)
    {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(arr));
    }
    public static int remove(int[] arr)
    {
        HashSet<Integer> set=new HashSet<>();
        int i=0;

        for(int el:arr)
        {
            if(!set.contains(el))
            {
                set.add(el);
                arr[i]=el;
                i++;
            }

        }

        return i;
    }
}
