package Practice.Strings;

import java.util.Arrays;

public class LongestCommonPrefix1
{
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(pre(strs));
    }
    public static String pre(String[] strs)
    {
        //String pre="";
        StringBuilder str=new StringBuilder();
        Arrays.sort(strs);

        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
            {
                break;
            }
            str.append(first[i]);
        }
        return new String(str);


    }
}
