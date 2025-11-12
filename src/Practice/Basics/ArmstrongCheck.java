package Practice.Basics;

public class ArmstrongCheck
{
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
    public static boolean armstrong(int num)
    {
        int temp=num;
        int sum=0;
        int length=count(num);
        while(num!=0)
        {
            int last=num%10;
            sum=sum+(int)Math.pow(last,length);
            num=num/10;
        }
        if(sum==temp)
        {
            return true;
        }
        return false;
    }
    public static int count(int number)
    {
        int count=0;
        while(number!=0)
        {
            count++;
            number=number/10;
        }
        return count;
    }

}
