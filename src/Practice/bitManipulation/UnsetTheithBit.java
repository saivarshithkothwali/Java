package Practice.bitManipulation;

public class UnsetTheithBit
{
    public static void main(String[] args)
    {
        printBits(89);
        int num1=unset(89,1);
        printBits(num1);
    }
    public static int unset(int num,int i)
    {
        return (num & (~(1<<i)));
    }
    public static void printBits(int num)
    {
        for(int i=7;i>=0;i--)
        {
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }
}
