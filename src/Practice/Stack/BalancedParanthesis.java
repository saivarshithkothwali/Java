package Practice.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedParanthesis
{
    public static void main(String[] args)
    {
        String str="[]";
        System.out.println(balanced(str));
    }
    public static boolean balanced(String str)
    {
        //Deque<Integer> stack=new ArrayDeque<>();
//        Stack<Character> st=new Stack<>();
//        for(char ch:str.toCharArray())
//        {
//            if(ch=='(' || ch=='{' ||ch=='[')
//            {
//                st.push(ch);
//            }
//            else
//            {
//                if(st.isEmpty())
//                {
//                    return false;
//                }
//                if(ch==')' && st.peek()!='(')
//                {
//                    return false;
//                }
//                if(ch==']' && st.peek()!='[')
//                {
//                    return false;
//                }
//                if(ch=='}' && st.peek()!='{')
//                {
//                    return false;
//                }
//                st.pop();
//            }
//        }
//        return st.isEmpty();
        Deque<Character> dq=new ArrayDeque<>();

        for(char ch:str.toCharArray())
        {
            if(ch=='(' || ch=='[' || ch=='{')
            {
                dq.push(ch);
            }
            else
            {
                if(dq.isEmpty())
                {
                    return false;
                }
                else if(ch==')' && dq.peek()!='(')
                {
                    return false;
                }
                else if(ch=='}' && dq.peek()!='{')
                {
                    return false;
                }
                else if(ch==']' && dq.peek()!='[')
                {
                    return false;
                }

            }

        }
        return dq.isEmpty();
    }
}


