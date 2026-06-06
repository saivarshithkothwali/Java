package Practice.Stack;

public class MinAddToMakeValidParanthesisOptimal
{
    public static void main(String[] args) {
        String str="())(";
        System.out.println(count(str));
    }
    public static int count(String str)
    {
        int res=0;
        int open=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='(')
            {
                open++;
            }
            else
            {
                if(open>0)
                {
                    open--;
                }
                else {
                    res++;
                }

            }
        }
        return res+open;
    }
}
