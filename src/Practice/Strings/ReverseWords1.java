package Practice.Strings;

public class ReverseWords1
{
    public static void main(String[] args) {
        System.out.println(reverse("Hello Coder"));
    }
    public static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder();
        int startIndex=str.length()-1;

        while(startIndex>=0)
        {
            while(startIndex>=0 && str.charAt(startIndex)==' ')
            {
                startIndex--;
            }
            if(startIndex<0)
            {
                break;
            }
            int endIndex=startIndex;
            while(startIndex>=0 && str.charAt(startIndex)!=' ')
            {
                startIndex--;
            }
            if(sb.length()==0)
            {
                sb.append(str.substring(startIndex+1,endIndex+1));
            }
            else
            {
                sb.append(' ');
                sb.append(str.substring(startIndex+1,endIndex+1));
            }


        }
        return sb.toString();
    }
}
