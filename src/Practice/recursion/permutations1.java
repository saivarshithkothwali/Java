package Practice.recursion;

import java.util.ArrayList;

public class permutations1
{
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) {
        permu("","abc");
        System.out.println(list);
    }
    public static void permu(String p,String up)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0,i);
            String last=p.substring(i,p.length());

            permu(first+ch+last,up.substring(1));
        }
    }

}
