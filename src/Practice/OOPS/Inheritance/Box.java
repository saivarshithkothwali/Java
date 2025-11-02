package Practice.OOPS.Inheritance;

public class Box
{
    double length;
    double width;
    double height;
    double weight;

    Box()
    {

        super();

        System.out.println("Box constructor is called");

        this.length=-1;
        this.width=-1;
        this.height=-1;
        this.weight=-1;
    }

    //Cube
    Box(double side)
    {
        this.length=side;
        this.width=side;
        this.height=side;
    }

    Box(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }

    Box(Box old)
    {
        this.length=old.length;
        this.width=old.width;
        this.height=old.height;
    }
}
