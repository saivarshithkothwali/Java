package Practice.recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazePrintPaths1
{
    public static void main(String[] args) {
        System.out.println(paths("",3,3));
    }
    public static List<String> paths(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();

        if(r>1)
        {
            ans.addAll(paths(p+"D",r-1,c));
        }
        if(c>1)
        {
            ans.addAll(paths(p+"R",r,c-1));
        }

        return ans;
    }
}
