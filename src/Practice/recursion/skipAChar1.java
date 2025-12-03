package Practice.recursion;

public class skipAChar1
{
    public static void main(String[] args) {
        System.out.println(skip("","cabbacd"));
    }
    public static String skip(String p,String up)
    {



        if(up.isEmpty())
        {
            //System.out.println(p);
            return p;
        }

        char ch=up.charAt(0);

        if(ch=='a')
        {
            return skip(p,up.substring(1));
        }
        else
        {
            return skip(p+ch,up.substring(1));
        }
    }
}
