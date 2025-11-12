package Practice.OOPS.StaticExample;

public class Human
{
    String name;
    int age;
    static int salary;
    boolean married;
    static long population;

    static void message()
    {
        System.out.println("Hello");
        //System.out.println(this.age);
    }

    public Human(String name,int age, int salary, boolean married)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }

}
