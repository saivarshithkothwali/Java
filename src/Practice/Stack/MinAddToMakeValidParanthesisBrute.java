package Practice.Stack;

import java.util.Stack;

public class MinAddToMakeValidParanthesisBrute
{
    public static void main(String[] args)
    {
        String str=")))";
        System.out.println(count(str));
    }
    public static int count(String str)
    {
        Stack<Character> st=new Stack<>();
        int res=0;

        for(char ch:str.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);
            }
            else
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
                else
                {
                    res++;
                }

            }
        }
        return st.size()+res;
    }
}
