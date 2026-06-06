package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashSet;

public class LongestSubStringWihKDistinctCharBrute
{
    public static void main(String[] args) {
        String str="aaa";
        System.out.println(longest(str,2));
    }
    public static int longest(String str,int k)
    {
        int maxCount=0;
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            set.clear();
            for(int j=i;j<str.length();j++)
            {
                set.add(str.charAt(j));
                if(set.size()<=k)
                {

                    maxCount=Math.max(maxCount,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxCount;
    }
}
