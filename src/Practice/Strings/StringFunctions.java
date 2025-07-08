package Practice.Strings;

import java.util.Scanner;

public class StringFunctions
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a line");
        String line=obj.nextLine();
        System.out.println("Enter a word");
        String word=obj.next();
        System.out.println("line is"+line);
        System.out.println("word is"+word);

    }
}
