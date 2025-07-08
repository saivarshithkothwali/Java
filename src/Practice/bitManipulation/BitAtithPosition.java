package Practice.bitManipulation;

public class BitAtithPosition
{
    public static void main(String[] args) {
        System.out.println(bit( 145, 4));
    }
    public static int bit(int num,int i)
    {
        if((num & (1<<i))!=0)
        {
            return 1;
        }
        else
            return 0;
    }
}
