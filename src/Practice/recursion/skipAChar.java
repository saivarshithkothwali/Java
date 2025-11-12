package Practice.recursion;

public class skipAChar
{
    public static void main(String[] args)
    {

        System.out.println(skip("cabbac"));
    }
    public static String skip(String str)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch!='a')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
