package Practice.Basics;

public class Reverse
{
    public static void main(String[] args) {
        System.out.println(reverse(1789));
    }
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int last=num%10;
            rev=rev*10+last;
            num=num/10;

        }
        return rev;
    }
}
