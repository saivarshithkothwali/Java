package Practice.Array;

import java.util.HashSet;

public class longestConsecutiveSequenceOptimal
{
    public static void main(String[] args)
    {
        int[] arr={9,1,4,7,4,3,-1,0,5,100,101,8,-1,6};
        System.out.println(longest(arr));
    }
    public static int longest(int[] arr)
    {
        HashSet<Integer> set=new HashSet<>();

        for(int el:arr)
        {
            set.add(el);
        }

        int maxCount=0;

        for(int el:set)
        {
            int previousEl=el-1;
            if(!set.contains(previousEl))
            {
                int count=1;
                int nextEl=el+1;

                while(set.contains(nextEl))
                {
                    count++;
                    nextEl++;
                }
                maxCount=Math.max(count,maxCount);
            }

        }
        return maxCount;

    }


}


