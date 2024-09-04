import java.util.ArrayList;

public class Tank
{
    public String name;
    public String natioanlity;
    public ArrayList<Person> crew = new ArrayList<>();

    public Tank(String name, String natioanlity)
    {
        this.name = name;
        this.natioanlity = natioanlity;
    }

}
