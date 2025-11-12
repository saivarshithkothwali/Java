package Practice.OOPS;

public class ConstructorWithNoArguments {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Student student1=new Student();

        student1.greeting();



//        System.out.println(student1.rno);
//        System.out.println(student1.name);
//        System.out.println(student1.marks);

    }
    static class Student
    {
        int rno;
        String name;
        float marks;

        void greeting()
        {
            System.out.println("Hello my name is " +this.name);
        }
        Student()
        {
            this.rno=1;
            this.name="kunal";
            this.marks=67.8f;
        }

    }
}
