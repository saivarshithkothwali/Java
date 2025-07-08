package Practice.bitManipulation;

public class clearLSBUntili
{
    public static void main(String[] args)
    {
        printBits(53);
        int num1=clear(53,4);
        printBits(num1);
    }
    public static void printBits(int num)
    {
        for(int i=7;i>=0;i--)
        {
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }
    public static int clear(int num,int i)
    {
        return num & (~((1<<(i+1))-1));
    }
}
