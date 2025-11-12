package Practice.slidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacementOptimal
{
    public static void main(String[] args) {
        String s="AABABBA";
        System.out.println(longest(s,2));
    }
    public static int longest(String s,int k)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxF=0;
        int l=0,r=0;
        int maxLen=0;
        while(r<s.length())
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            maxF=Math.max(maxF,map.get(s.charAt(r)));

            if((r-l+1)-maxF>k)
            {
                if((r-l+1)-maxF>k)
                {
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    l++;
                }
            }


            else
            {
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
