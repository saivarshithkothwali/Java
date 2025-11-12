package Practice.Strings;

public class RemoveOuterPara1
{
    public static void main(String[] args)
    {
        System.out.println(remove("((()))"));
    }
    public static String remove(String str)
    {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                if(count!=0)
                {
                    sb.append(ch);
                    count++;
                }
                else
                {
                    count++;
                }
            }
            else
            {
                count--;
                if(count!=0)
                {
                    sb.append(ch);
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
