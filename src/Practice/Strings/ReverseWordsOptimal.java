package Practice.Strings;

public class ReverseWordsOptimal
{
    public static void main(String[] args)
    {

        System.out.println(reverse("   Hello  Coder "));
    }
    public static String reverse(String str)
    {
        int s=str.length()-1;
        StringBuilder rev=new StringBuilder();

        while(s>=0)
        {
            while(s>=0 && str.charAt(s)==' ')
            {
                s--;
            }

            if(s<0)
            {
                break;

            }

            int e=s;

            while(s>=0 && str.charAt(s)!=' ')
            {
                s--;
            }

            if(rev.isEmpty())
            {
                rev.append(str.substring(s+1,e+1));
            }
            else
            {
                rev.append(' ');
                rev.append(str.substring(s+1,e+1));
            }

        }
        return rev.toString();
    }
}
