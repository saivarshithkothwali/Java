package Practice.Strings;

public class MaxNestingDepth1
{
    public static void main(String[] args) {
        String s="(1)+((2))+(((3)))";
        System.out.println(depth(s));
    }
    public static int depth(String s)
    {
        int maxCount=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
