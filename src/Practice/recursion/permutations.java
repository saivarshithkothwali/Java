package Practice.recursion;

import java.util.ArrayList;

public class permutations
{
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args)
    {
        String str="abc";
        permu("",str);
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
            String f=p.substring(0,i);
            String l=p.substring(i);
            permu(f+ch+l,up.substring(1));

        }
    }
}


