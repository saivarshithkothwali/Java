package Practice.recursion;

import java.util.ArrayList;

public class permutations2
{
    public static void main(String[] args) {
        System.out.println(permu("","abc"));

    }
    public static ArrayList<String> permu(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0,i);
            String last=p.substring(i,p.length());

            ans.addAll( permu(first+ch+last,up.substring(1)));

        }
        return ans;
    }
}
