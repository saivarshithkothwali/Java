package Practice.bitManipulation;

public class UnsetTheRightMostSetBit
{
    public static void main(String[] args)
    {
        printBits(123);
        int num2=unsetRightMostSetBit(123);
        printBits(num2);
    }
    public static int unsetRightMostSetBit(int num)
    {
        return (num&(num-1));
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
