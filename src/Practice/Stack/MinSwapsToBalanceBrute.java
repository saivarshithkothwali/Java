package Practice.Stack;

import java.util.Stack;

public class MinSwapsToBalanceBrute
{
    public static void main(String[] args)
    {
        String str="]][[";
        System.out.println(findSwaps(str));
    }
    public static int findSwaps(String str)
    {
        Stack<Character> st=new Stack<>();
        int close=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    close++;
                }
                else
                {
                    st.pop();
                }
            }
        }

        return (int)Math.ceil(close/2.0);
    }
}
