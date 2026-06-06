package Practice.Strings;
import java.util.Stack;

public class RemoveOuterParaBrute
{
    public static void main(String[] args)
    {
        String str="((()))(())";
        System.out.println(remove(str));
    }
    public static String remove(String str)
    {
       Stack<Character> st=new Stack<>();
       String output="";

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
                   output=output+ch;
                   st.push(ch);
               }
           }
           else
           {
               st.pop();

               if(!st.isEmpty())
               {
                   output=output+ch;
               }
               else
               {
                   continue;
               }
           }
       }
       return output;


    }
}
