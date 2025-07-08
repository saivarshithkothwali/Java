package Practice.bitManipulation;

public class ConvertLowerToUpper
{
    public static void main(String[] args)
    {
        char ch=convert('e');
        System.out.println(ch);

    }
    public static char convert(int num)
    {
        return (char)(num & ~(1<<5));
    }
}
