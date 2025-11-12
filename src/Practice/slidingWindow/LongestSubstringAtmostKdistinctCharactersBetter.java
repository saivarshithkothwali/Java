package Practice.slidingWindow;

import java.util.HashMap;

public class LongestSubstringAtmostKdistinctCharactersBetter
{
    public static void main(String[] args)
    {
        System.out.println(longest("aaabbcccc",2));
    }
    public static int longest(String str,int k)
    {
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int r=0,l=0;
        while(r<str.length())
        {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);

            if(map.size()>k)
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
            else
            {
                maxLen = Math.max(maxLen, r - l + 1);
            }


            r++;
        }
        return maxLen;
    }
}
