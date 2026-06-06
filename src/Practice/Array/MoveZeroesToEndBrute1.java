package Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroesToEndBrute1
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,0,2,3,2,0,0,4,5,1));
        System.out.println(moveZeroes(list));
    }
    public static List<Integer> moveZeroes(List<Integer> list)
    {
        List<Integer> ans=new ArrayList<>();

        for(int el:list)
        {
            if(el!=0)
            {
                ans.add(el);
            }
        }
        while(ans.size()<list.size())
        {
            ans.add(0);
        }
        return ans;
    }
}
