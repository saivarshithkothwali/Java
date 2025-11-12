package Practice.OOPS;

public class MemoryAllocatonOfNewKeyword
{
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Student one=new Student();
        Student two=one;

        one.name="kunal";
        System.out.println(two.name);
    }
    static class Student
    {
        int rno;
        String name;
        float marks;

        Student()
        {
            this.rno=19;
            this.name="varshith";
            this.marks=76.5f;
        }
    }
}
