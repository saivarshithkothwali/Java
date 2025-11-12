package Practice.Strings;

import java.util.HashMap;

public class IsomorphicBetter
{
    public static void main(String[] args)
    {
        String s="see";
        String t="egg";
        System.out.println(isomorphicString(s,t));

    }
    public static boolean isomorphicString(String s,String t) {
        HashMap<Character, Character> StoTmap = new HashMap<>();
        HashMap<Character, Character> TtoSmap = new HashMap<>();

        StringBuilder sbS=new StringBuilder(s);
        StringBuilder sbT=new StringBuilder(t);
        for(int i=0;i<s.length();i++)
        {
            char s1=sbS.charAt(i);
            char t1=sbT.charAt(i);

            if(!StoTmap.containsKey(s1))
            {
                StoTmap.put(s1,t1);
            }
            if(!TtoSmap.containsKey(t1))
            {
                TtoSmap.put(t1,s1);
            }
            if(StoTmap.get(s1)!=t1 || TtoSmap.get(t1)!=s1)
            {
                return false;
            }
        }
        return true;

    }
}
