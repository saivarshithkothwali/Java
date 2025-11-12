package Practice.Strings;

import java.util.Arrays;

public class IsomorphicOptimal
{
    public static void main(String[] args) {
        String s="see";
        String t="egg";
        System.out.println(isomorphicString(s,t));
    }
    public static boolean isomorphicString(String s,String t)
    {
        int[] stoTMap=new int[128];
        int[] ttoSMap=new int[128];
        Arrays.fill(stoTMap,-1);
        Arrays.fill(ttoSMap,-1);

        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            char t1=t.charAt(i);

            if(stoTMap[s1]==-1)
            {
                stoTMap[s1]=t1;
            }
            if(ttoSMap[t1]==-1)
            {
                ttoSMap[t1]=s1;
            }
            if(stoTMap[s1]!=t1 || ttoSMap[t1]!=s1)
            {
                return false;
            }
        }
        return true;
    }
}
