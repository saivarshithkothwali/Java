package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharactersBrute
{
    public static void main(String[] args) {
        String str="bbbabcd";
        System.out.println(longestSubStr(str));
    }
    public static int longestSubStr(String str)
    {
        HashSet<Character> set=new HashSet<>();
        int maxLen=0;

        for(int i=0;i<str.length();i++)
        {
            set.clear();
            for(int j=i;j<str.length();j++)
            {
                //System.out.println(str.charAt(j));
                if(!set.contains(str.charAt(j)))
                {
                    set.add(str.charAt(j));
                    maxLen=Math.max(maxLen,j-i+1);

                }
                else {
                    break;
                }

            }
        }
        return maxLen;
    }
}
