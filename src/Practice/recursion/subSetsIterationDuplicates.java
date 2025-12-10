package Practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSetsIterationDuplicates
{
    public static void main(String[] args)
    {
        int[] nums={2,1,2};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++)
        {
            start=0;
            if(i>0 && nums[i]==nums[i-1])
            {
                start=end+1;
            }
            end=outer.size()-1;

            int size=outer.size();
            for(int j=start;j<size;j++)
            {
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }

        }
        return outer;
    }
}
