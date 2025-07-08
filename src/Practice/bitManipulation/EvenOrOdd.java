package Practice.bitManipulation;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        System.out.println(even(-1234));
    }
    public static boolean even(int num)
    {
        if((num & (1<<0))==0)
        {
            return true;
        }
        else
            return false;

    }
}
