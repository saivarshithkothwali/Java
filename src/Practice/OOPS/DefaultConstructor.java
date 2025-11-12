package Practice.OOPS;

public class DefaultConstructor
{
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Student student1=new Student();

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

    }
    static class Student
    {
         int rno;
         String name;
         float marks;



    }
}
