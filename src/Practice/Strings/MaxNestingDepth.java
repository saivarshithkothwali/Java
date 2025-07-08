package Practice.Strings;
import java.util.Stack;

public class MaxNestingDepth
{
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(depth(s));
    }
    public static int depth(String s)
    {
        int maxCount=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                st.pop();
            }
            maxCount=Math.max(st.size(),maxCount);
        }


        return maxCount;
    }
}
