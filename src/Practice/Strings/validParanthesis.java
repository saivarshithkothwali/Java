package Practice.Strings;

import java.util.Stack;

public class validParanthesis
{
    public static void main(String[] args) {
        String str="(((";
        System.out.println(valid(str));
    }
    public static boolean valid(String str)
    {
        Stack<Character> st=new Stack<>();

        for(char ch:str.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(ch==')')
                {
                    if(st.peek()=='(')
                    {
                        st.pop();

                    }
                    else
                    {
                        return false;
                    }

                }
                else if(ch==']')
                {
                    if(st.peek()=='[')
                    {
                        st.pop();

                    }
                    else
                    {
                        return false;
                    }

                }
                else if(ch=='}')
                {
                    if(st.peek()=='{')
                    {
                        st.pop();

                    }
                    else
                    {
                        return false;
                    }

                }
            }

        }
        return st.isEmpty();
    }
}

