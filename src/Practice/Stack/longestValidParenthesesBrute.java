package Practice.Stack;

import java.util.Stack;

public class longestValidParenthesesBrute
{
    public static void main(String[] args) {
        String s="())()()(";
        System.out.println(longest(s));
    }
    public static int longest(String s)
    {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='(')
            {

                st.push(i);
            }
            else
            {
                if(!st.isEmpty() && s.charAt(st.peek())=='(')
                {
                    st.pop();
                }
                else
                {
                    st.push(i);
                }

            }
        }
        if(st.isEmpty())
        {
            return s.length();
        }

        int maxLen=0;
        int right=s.length();

        while(!st.isEmpty())
        {
            int left=st.pop();

            maxLen=Math.max(maxLen,right-left-1);

            right=left;



        }
        maxLen=Math.max(maxLen,right);
        return maxLen;
    }
}
