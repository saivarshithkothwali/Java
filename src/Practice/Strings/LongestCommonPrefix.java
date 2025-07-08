package Practice.Strings;

public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] strs={"dog","racecar","car"};
        //"flower","flow","flight"
        System.out.println(prefix(strs));

    }
    public static String prefix(String[] strs)
    {
        String pre="";
        for(int i=0;i<strs[0].length();i++)
        {
            char currentChar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=currentChar)
                {
                    return pre;
                }
            }
            pre=pre+currentChar;
        }


        return pre;
    }
}
