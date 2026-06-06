package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashMap;

public class LongestSubStringWihKDistinctCharBetter
{
    public static void main(String[] args)
    {
        String str="aaabbcccdddd";
        System.out.println(longest(str,2));
    }
    public static int longest(String str,int k)
    {
        int l=0,r=0;
        int maxCount=0;
        HashMap<Character,Integer> map=new HashMap<>();

        while(r<str.length())
        {
            map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)+1);

            if(map.size()<=k)
            {
                maxCount=Math.max(maxCount,(r-l+1));

            }
            else
            {
                while(map.size()>k)
                {
                    map.put(str.charAt(l),map.get(str.charAt(l))-1);

                    if(map.get(str.charAt(l))==0)
                    {
                        map.remove(str.charAt(l));
                    }
                    l++;
                }
            }
            r++;
        }
        return maxCount;
    }
}
