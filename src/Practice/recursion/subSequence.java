package Practice.recursion;

import java.util.ArrayList;

public class subSequence
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        subseq("","abc",list);
        System.out.println(list);
    }
    public static void subseq(String p, String up, ArrayList<String> list)
    {

        if(up.isEmpty() )
        {
            if(!p.isEmpty())
            {
                list.add(p);

            }
            return;

        }
        char ch=up.charAt(0);

        subseq(p+ch,up.substring(1),list);
        subseq(p,up.substring(1),list);
    }
}
