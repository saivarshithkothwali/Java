package Practice.Stack;

import java.util.Stack;

public class MinRemoveToMakeStringValidBrute
{
    public static void main(String[] args) {
        String s="lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
    public static String minRemoveToMakeValid(String s)
    {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);

            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')')
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

        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            if(!st.isEmpty() && st.peek()==i)
            {
                st.pop();
            }

            else if(!st.isEmpty() && st.peek()!=i)
            {
                sb.append(s.charAt(i));
            }
            else if(st.isEmpty())
            {
                sb.append(s.charAt(i));
            }
        }

        return sb.reverse().toString();
    }
}
