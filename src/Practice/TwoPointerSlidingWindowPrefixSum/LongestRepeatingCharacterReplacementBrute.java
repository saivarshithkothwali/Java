package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacementBrute
{
    public static void main(String[] args)
    {
        String s="AABABBA";
        System.out.println(longest(s,2));
    }
    public static int longest(String s,int k)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;

        for(int i=0;i<s.length();i++)
        {

            int maxFreq=0;
            map.clear();

            for(int j=i;j<s.length();j++)
            {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

                int subStringSize=j-i+1;
                maxFreq=Math.max(maxFreq,map.get(s.charAt(j)));

                int charactersNeedToBeChanged=subStringSize-maxFreq;

                if(charactersNeedToBeChanged<=k)
                {
                    maxLen=Math.max(maxLen,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        return maxLen;
    }
}
