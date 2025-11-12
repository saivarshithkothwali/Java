package Practice.Stack;
import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElementOptimal
{
    public static void main(String[] args) {
        int[] arr={3,1,5,7,2,1};
        System.out.println(Arrays.toString(nge(arr)));
    }
    public static int[] nge(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        int[] temp=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                temp[i]=-1;
                st.push(arr[i]);
            }
            else
            {
                temp[i]=st.peek();
                st.push(arr[i]);
            }

        }
        return temp;
    }
}
