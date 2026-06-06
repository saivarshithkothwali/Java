package Practice.Strings;

import java.util.HashMap;

public class validAnagramBetter1
{
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        System.out.println(valid(str1,str2));
    }
    public static boolean valid(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:str1.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);

            if(!map.containsKey(ch))
            {
                return false;
            }

                map.put(ch,map.get(ch)-1);

                if(map.get(ch)==0)
                {
                    map.remove(ch);
                }

        }
        if(map.isEmpty())
        {
            return true;
        }
        return false;
    }
}
