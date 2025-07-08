package Practice.bitManipulation;

public class SetithBit
{
    public static void main(String[] args)
    {
        printBitsOfANumber(25);
        int num1=set(25,1);
        printBitsOfANumber(num1);
    }
    public static int set(int num,int i)
    {
        return (num | (1<<i));

    }
    public static void printBitsOfANumber(int num)
    {
        for(int i=7;i>=0;i--)
        {
            System.out.print((num>>i) &1);
        }
        System.out.println();
    }
}
