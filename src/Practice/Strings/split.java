package Practice.Strings;

import java.util.Arrays;

public class split
{
    public static void main(String[] args) {
        String str="   Hello  Coder    ";
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
