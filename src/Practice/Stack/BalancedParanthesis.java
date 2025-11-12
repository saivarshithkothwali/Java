package Practice.Stack;
import java.util.Stack;

public class BalancedParanthesis
{
    public static void main(String[] args) {
        String str="[()[]{}";
        System.out.println(balanced(str));
    }
    public static boolean balanced(String str)
    {
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray())
        {
            if(ch=='[' || ch=='{' || ch=='(')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                    return false;
                if(ch=='}' && st.pop()!='{')
                    return false;
                if(ch==']' && st.pop()!='[')
                    return false;
                if(ch==')' && st.pop()!='(')
                    return false;
            }
        }
        return st.isEmpty();
    }
}
