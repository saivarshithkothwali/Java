package Practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber2
{
    public static void main(String[] args) {
        System.out.println(phone("","12"));
    }
    public static List<String> phone(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans=new ArrayList<>();

        int digit=up.charAt(0)-'0';

        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);

            ans.addAll(phone(p+ch,up.substring(1)));
        }
        return ans;
    }
}
