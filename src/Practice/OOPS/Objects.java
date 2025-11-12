package Practice.OOPS;

import java.util.Arrays;



public class Objects
{
    public static void main(String[] args)
    {
        Student[] students=new Student[5];

        Student student1=new Student(1,"kunal",99.8f);
        Student student2=new Student();

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        System.out.println(student2);



    }

    static class Student
    {
        int rno;
        String name;
        float marks;

        Student(){
            this.rno=2;
            this.name="varshith";
            this.marks=67.6f;
        }

        Student(int rno,String name,float marks)
        {
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }
    }
}
