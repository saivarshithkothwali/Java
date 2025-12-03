package Practice.recursion;

public class skipAChar
{
    public static void main(String[] args)
    {

        System.out.println(skip("cabbac"));
    }
    public static String skip(String str)
    {
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='a')
            {
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }
}
