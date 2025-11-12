package Practice.Basics;

public class PalindromeCkeck
{
    public static void main(String[] args)
    {
        System.out.println(palindrome(18821));
    }
    public static boolean palindrome(int num)
    {
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            int last=num%10;
            rev=(rev*10)+last;
            num=num/10;

        }
        if(temp==rev)
            return true;
        return false;
    }
}
