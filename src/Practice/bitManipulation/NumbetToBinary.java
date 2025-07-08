package Practice.bitManipulation;

public class NumbetToBinary
{
    public static void main(String[] args) {
        binary(0);

    }
    public static void binary(int num)
    {
        if(num==0) {

            return;
        }

        binary(num/2);

        System.out.print(num%2);

    }
}
