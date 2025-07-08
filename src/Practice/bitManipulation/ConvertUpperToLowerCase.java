package Practice.bitManipulation;

public class ConvertUpperToLowerCase
{
    public static void main(String[] args)
    {

        char ch =convert('A');
        System.out.println(ch);


    }

    public static char convert(int num)
    {
         return (char)(num | (1<<5));
    }
}
