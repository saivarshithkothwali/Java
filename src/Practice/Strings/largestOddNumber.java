package Practice.Strings;

public class largestOddNumber
{
    public static void main(String[] args) {
        System.out.println(largest("348"));

    }
    public static String largest(String num)
    {
        if(num.charAt(num.length()-1)%2!=0)
        {
            return num;
        }

        int index=num.length()-2;

        while(index>=0)
        {
            if((num.charAt(index)-'0')%2!=0)
            {
                return num.substring(0,index+1);
            }
            index--;
        }
        return "";
    }
}
