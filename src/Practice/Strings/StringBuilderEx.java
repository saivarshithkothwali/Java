package Practice.Strings;

public class StringBuilderEx
{
    public static void main(String[] args)
    {
        StringBuilder name1=new StringBuilder("varshith");
        StringBuilder name2=new StringBuilder("varshith");
        StringBuilder name3=new StringBuilder("varshith");
        StringBuilder name4=name1;

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name1));
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name2));
        System.out.println(name1.equals(name4));

    }
}
