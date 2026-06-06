package Practice.Stack;

public class CountTheReversalsOptimal
{
    public static void main(String[] args)
    {
        String str="}}}}{{{{";
        System.out.println(count(str));
    }
    public static int count(String str)
    {
        int open=0,close=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='{')
            {
                open++;
            }
            else
            {
                if(open==0)
                {
                    close++;
                }
                else
                {
                    open--;
                }
            }

        }
        return (int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
    }
}
