package Practice.Basics;

public class CountDigits
{
    public static void main(String[] args) {
        System.out.println(count(1234));
    }
    public static int count(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}
