package Practice.Stack;

public class MinRemoveToMakeStringValidOptimal
{
    public static void main(String[] args) {
        String str="lee(t(c)o(de(";
        System.out.println(Minremove(str));
    }
    public static String Minremove(String str)
    {
        int open=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='(')
            {
                sb.append(ch);
                open++;
            }
            else if(ch==')'){
                if(open!=0)
                {
                    open--;
                    sb.append(ch);
                }
                else
                {
                    continue;
                }
            }
            else
            {
                sb.append(ch);
            }
        }
        StringBuilder sb1=new StringBuilder();

        for(int i=sb.length()-1;i>=0;i--)
        {
            char ch=sb.charAt(i);

            if(ch=='(' && open!=0)
            {
                open--;
            }
            else
            {
                sb1.append(ch);
            }
        }
        return sb1.reverse().toString();
    }
}
