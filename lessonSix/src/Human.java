public class Human
{
    String name;
    String gender;
    int age;

    public Human(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void emerytura(String name, int age, String gender)
    {
        if((age >= 60 && gender.equals("k"))||(age >= 65 && gender.equals("m")))
            System.out.println(name + " jest emerytem");
        else
            System.out.println(name + " nie jest emerytem");

    }
}
