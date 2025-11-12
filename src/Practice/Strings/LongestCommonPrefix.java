package Practice.Strings;

public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] strs={"flower"};
        System.out.println(prefix(strs));

    }
    public static String prefix(String[] strs)
    {
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<strs[0].length();i++)
        {
            char currentChar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || currentChar!=strs[j].charAt(i))
                {
                    return ans.toString();
                }
            }
            ans.append(currentChar);
        }
        return ans.toString();
    }
}
