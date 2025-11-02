package Practice.OOPS.Inheritance;

public class BoxWeight extends Box
{
    double weight;

    BoxWeight()
    {
        System.out.println("BoxWeight constructor is being called");

        this.weight=-1;

//        System.out.println(this.weight);
//        System.out.println(super.weight);

    }

    BoxWeight(BoxWeight other)
    {
        super(other);
        this.weight=other.weight;
    }

    BoxWeight(double length,double width,double height,double weight)
    {
        //super(length,width,height);

        this.weight=weight;

    }

}
