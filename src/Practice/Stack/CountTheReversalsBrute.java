package Practice.Stack;

import java.util.Stack;

public class CountTheReversalsBrute
{
    public static void main(String[] args) {
        String str="}{{}}{{{";
        System.out.println(count(str));
    }
    public static int count(String str)
    {
        Stack<Character> st=new Stack<>();
        int rev=0;
        for(char ch:str.toCharArray())
        {
            if(ch=='{')
            {
                st.push(ch);
            }
            else {
                if(st.isEmpty())
                {
                    rev++;
                }
                else {
                    st.pop();
                }
            }
        }

        int open=st.size();
        int close=rev;

        return (int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));

    }
}
