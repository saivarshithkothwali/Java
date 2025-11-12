package Practice.OOPS;

public class InnerClass1
{
     class Test{
        String name;
        public Test(String name)
        {
            this.name=name;
        }
    }

    public static void main(String[] args) {
         InnerClass1 outer=new InnerClass1();
        InnerClass1.Test a=outer.new Test("varshith");
        System.out.println(a.name);
    }
}
