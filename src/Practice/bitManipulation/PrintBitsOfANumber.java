package Practice.bitManipulation;

public class PrintBitsOfANumber
{
    public static void main(String[] args)
    {
        int num=11;
        for(int i=7;i>=0;i--)
        {
            System.out.print((num>>i) & 1);
        }
    }

}
