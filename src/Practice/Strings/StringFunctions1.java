package Practice.Strings;

public class StringFunctions1
{
    public static void main(String[] args) {
        String str="varshith";
//        System.out.println(str.charAt(0));
//        System.out.println(str.indexOf('h'));
//        System.out.println(str.lastIndexOf('h'));
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }

    }
}
