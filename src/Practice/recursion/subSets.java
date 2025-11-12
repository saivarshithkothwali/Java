package Practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class subSets
{
    static List<List<Integer>> res=new ArrayList<>();
    public static void main(String[] args)
    {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums)
    {
        findSubSets(nums,0,new ArrayList<>());
        return res;
    }
    public static void findSubSets(int[] nums,int index,List<Integer> subList)
    {
        //Base case
        if(index==nums.length)
        {
            res.add(new ArrayList<>(subList));
            return;
        }
        //pick
        subList.add(nums[index]);
        findSubSets(nums,index+1,subList);

        //BackTracking
        subList.remove(subList.size()-1);

        //No pick
        findSubSets(nums,index+1,subList);
    }
}
