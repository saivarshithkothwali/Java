package Practice.Strings;
import java.util.Stack;

public class RemoveOuterPara
{
    public static void main(String[] args)
    {
        System.out.println(remove("((()))(())"));
    }
    public static String remove(String str)
    {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                if(!st.isEmpty())
                {
                    st.push(ch);
                    sb.append(ch);
                }
                else
                {
                    st.push(ch);
                }
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                {
                    sb.append(ch);
                }
                else
                {
                    continue;
                }
            }
        }
        return sb.toString();
    }
}
