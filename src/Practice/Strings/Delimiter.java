package Practice.Strings;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Delimiter
{
    public static void main(String[] args)
    {
        String str="   Hello  Coder ";
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
    }



}
