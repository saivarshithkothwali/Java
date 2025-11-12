package Practice.Stack;



import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElementOptimal
{
    public static void main(String[] args) {
        int[] arr={5,7,9,6,7,4,5,1,3,7};
        System.out.println(Arrays.toString(smaller(arr)));
    }
    public static int[] smaller(int[] arr)
    {
        int[] temp=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && st.peek()>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                temp[i]=-1;
            }
            else
            {
                temp[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return temp;
    }

}
