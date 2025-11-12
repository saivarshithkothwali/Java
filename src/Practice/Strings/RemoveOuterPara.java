package Practice.Strings;
import java.util.Stack;

public class RemoveOuterPara
{
    public static void main(String[] args)
    {
        String str="((()))(())";
        System.out.println(remove(str));
    }
    public static String remove(String str)
    {
        Stack<Character> st=new Stack<>();
        //String ans="";
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
                    st.push(ch);
                    sb.append(ch);
                }
            }
            else
            {
                st.pop();
                if(st.isEmpty())
                {
                    continue;
                }
                else
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();


    }
}
