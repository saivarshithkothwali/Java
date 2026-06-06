package Practice.Strings;

public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] str={"flower","flow","flowht"};
        System.out.println(prefix(str));

    }
    public static String prefix(String[] str)
    {
        String op="";

        for(int i=0;i<str[0].length();i++)
        {
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++)
            {

                if(i>=str[j].length() || ch!=str[j].charAt(i))
                {
                    return op;
                }
            }
            op=op+ch;
        }
        return op;
    }
}
