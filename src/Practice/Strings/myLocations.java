package Practice.Strings;

public class myLocations
{
    public static void main(String[] args) {
        String myLocations="Hyderabad, Pune, Banglore, Chennai, noida";
        String[] myLocationsList=myLocations.split(",");


        for(int i=0;i<myLocationsList.length;i++)
        {
            System.out.print(myLocationsList[i]+" ");
        }
    }
}
