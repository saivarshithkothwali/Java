package Practice.Strings;
import java.util.Stack;

public class RemoveOuterParaBrute1
{
    public static void main(String[] args)
    {
        String str="((()))(())";
        System.out.println(remove(str));
    }
    public static String remove(String str)
    {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='(')
            {
                if(st.isEmpty())
                {
                    st.push(ch);
                }
                else
                {
                    sb.append(ch);
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
