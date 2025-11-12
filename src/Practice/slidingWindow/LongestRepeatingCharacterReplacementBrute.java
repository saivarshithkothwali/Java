package Practice.slidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacementBrute
{
    public static void main(String[] args) {
        String s="AABABBA";
        System.out.println(longest(s,2));
    }
    public static int longest(String s,int k)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxF=0;
        int noOfConversions=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++)
        {
            map.clear();
            maxF=0;
            for(int j=i;j<s.length();j++)
            {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

                maxF=Math.max(maxF,map.get(s.charAt(j)));
                noOfConversions=(j-i+1)-maxF;

                if(noOfConversions<=k)
                    maxLen=Math.max(maxLen,j-i+1);
                else
                    break;
            }
        }
        return maxLen;
    }
}
