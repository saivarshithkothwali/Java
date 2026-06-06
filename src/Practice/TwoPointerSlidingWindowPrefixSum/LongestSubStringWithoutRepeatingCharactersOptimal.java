package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharactersOptimal
{
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(longestSubStr(str));
    }
    public static int longestSubStr(String str)
    {
        HashSet<Character> set=new HashSet<>();

        int l=0,r=0;
        int maxLen=0;

        while(r<str.length())
        {
            if(set.contains(str.charAt(r)))
            {
                while(set.contains((str.charAt(r))))
                {
                    set.remove(str.charAt(l));
                    l++;
                }
                set.add(str.charAt(r));
                maxLen=Math.max(maxLen,r-l+1);
            }
            else
            {
                maxLen=Math.max(maxLen,r-l+1);
                set.add(str.charAt(r));
            }
            r++;
        }
        return maxLen;
    }
}
