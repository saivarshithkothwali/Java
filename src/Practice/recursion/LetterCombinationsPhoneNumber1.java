package Practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber1
{
    static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        phone("","12");
        System.out.println(list);
    }
    public static void phone(String p,String up)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return;
        }
        int digit=up.charAt(0)-'0';

        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            phone(p+ch,up.substring(1));
        }
    }
}
