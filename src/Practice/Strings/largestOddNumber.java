package Practice.Strings;

public class largestOddNumber
{
    public static void main(String[] args) {
        System.out.println(largest("348778"));

    }
    public static String largest(String num)
    {

        for(int i=num.length()-1;i>=0;i--)
        {
            int digit=num.charAt(i)-'0';

            if((digit%2)!=0)
            {
                return num.substring(0,i+1);
            }

        }
        return "";



    }

}
