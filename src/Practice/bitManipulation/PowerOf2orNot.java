package Practice.bitManipulation;

public class PowerOf2orNot
{
    public static void main(String[] args) {
        powerOf2(64);

    }
    public static void powerOf2(int num)
    {
        if((num & (num-1))==0)
        {
            System.out.println("Number is power of 2 ");
        }
        else
            System.out.println("Number is not a power of 2");
    }
}
