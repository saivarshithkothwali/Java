package Practice.slidingWindow;

import java.util.HashSet;

public class LargestSubStringWithoutRepeatingCharacters
{
    public static void main(String[] args)
    {
        String str="abcabcbb";
        System.out.println(longest(str));
    }
    public static int longest(String str)
    {
        HashSet<Character> set=new HashSet<>();

        int l=0;
        int maxLen=0;
        for(int r=0;r<str.length();r++)
        {
            char ch=str.charAt(r);
            if(set.contains(ch))
            {
                while(set.contains(ch))
                {
                    set.remove(str.charAt(l));
                    l++;
                }
                set.add(ch);
            }
            else
            {
                set.add(ch);
                maxLen=Math.max(maxLen,r-l+1);
            }
        }
        return maxLen;

    }
}
