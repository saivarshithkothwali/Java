package Practice.Strings;

public class CompanyNames
{
    public static void main(String[] args) {
        String str1="varshith@gmail.com";
        String str2="shashwat@hotmail.com";

       String[] str3=str1.split("@");
        String[] str4=str2.split("@");

        String lastpart=str3[str3.length-1];
        //int atTheRateIndex=str1.lastIndexOf('@');
        int dotIndex=lastpart.lastIndexOf('.');
        System.out.println(lastpart.substring(0,dotIndex));
//        System.out.println(Arrays.toString(str3));
//        System.out.println(Arrays.toString(str4));

    }
}
