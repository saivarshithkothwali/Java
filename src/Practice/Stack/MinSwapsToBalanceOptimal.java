package Practice.Stack;

public class MinSwapsToBalanceOptimal
{
    public static void main(String[] args) {
        String str="]]][[[";
        System.out.println(findSwaps(str));
    }
    public static int findSwaps(String str)
    {
        int open=0,close=0;

        for(char ch:str.toCharArray())
        {
            if(ch=='[')
            {
                open++;
            }
            else
            {
                if(open>0)
                {
                    open--;
                }
                else
                {
                    close++;
                }
            }
        }
        return (int)Math.ceil(close/2.0);

    }
}

