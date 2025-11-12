package Practice.OOPS.StaticExample;

public class main
{
    public static void main(String[] args) {
        Human varshith=new Human("varshith",23,25000,false);
        Human kunal=new Human("kunal",26,45000,true);

        System.out.println(Human.population);
        System.out.println(Human.population);

        System.out.println(varshith.salary);
        System.out.println(kunal.salary);


    }
}
