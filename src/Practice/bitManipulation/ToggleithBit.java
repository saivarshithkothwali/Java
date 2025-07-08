package Practice.bitManipulation;

public class ToggleithBit
{
    public static void main(String[] args)
    {
        printBits(25);
        int num1=toggle(25,1);
        printBits(num1);
    }
    public static int toggle(int num,int i)
    {
        return (num^(1<<i));
    }
    public static void printBits(int num1)
    {
        for(int i=7;i>=0;i--)
        {
            System.out.print((num1>>i)&1);
        }
        System.out.println();
    }
}
