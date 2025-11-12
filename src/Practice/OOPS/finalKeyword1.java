package Practice.OOPS;

public class finalKeyword1
{
    public static void main(String[] args)
    {
        final Student student1=new Student("varshith");
        student1.name="sai";

        System.out.println(student1.name);
        //student1=new Student("sai varshith");
    }
    static class Student
    {
        final int a=10;
        String name;
        public Student(String name)
        {
            this.name=name;
        }
    }
}

