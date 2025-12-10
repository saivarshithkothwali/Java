package Practice.recursion;

public class skipAStringIfNotRequired
{
    public static void main(String[] args) {
        System.out.println(skip("lovesapplebecauseapp","app","apple"));
    }
    public static String skip(String s,String remove,String not)
    {
        if(s.isEmpty())
        {
            return "";
        }

        char ch=s.charAt(0);

        if(s.startsWith(remove) && !s.startsWith(not))
        {
            return skip(s.substring(remove.length()),remove,not);
        }
        else
        {
            return ch+skip(s.substring(1),remove,not);
        }
    }
}
