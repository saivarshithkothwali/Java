package Practice.Strings;

public class RemoveOuterPara1
{
    public static void main(String[] args)
    {
        System.out.println(remove("((()))"));
    }
    public static String remove(String str)
    {
        int count=0;
        StringBuilder sb=new StringBuilder();

        for(char ch:str.toCharArray())
        {
            if(ch=='(')
            {
                if(count==0)
                {

                    count++;
                }
                else
                {
                    count++;
                    sb.append(ch);
                }
            }
            else
            {
                count--;

                if(count==0)
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
