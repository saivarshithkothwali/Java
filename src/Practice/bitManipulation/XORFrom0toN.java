package Practice.bitManipulation;

public class XORFrom0toN
{
    public static void main(String[] args)
    {
        System.out.println(xor(6));;
    }
    public static int xor(int N)
    {
        if(N%4==1)
            return 1;
        if(N%4==2)
            return N+1;
        if(N%4==3)
            return 0;

        return N;
    }
}
