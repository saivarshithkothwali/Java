package Practice.Strings;

public class LowerToUpper
{
    public static void main(String[] args) {
        System.out.println(upper("vArshith 123"));

    }
    public static String upper(String str)
    {
        //StringBuilder sb=new StringBuilder();
        String s="";

        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                s=s+(char)(ch-32);
            }
            else
            {
                s=s+ch;
            }

        }
        return s;
    }
}
