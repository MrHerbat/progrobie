public class Human
{
    String name;
    int age;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void emerytura(int age)
    {
        boolean emerytura;
        if(age >= 60)
            emerytura = true;
        else
            emerytura = false;
        System.out.println(emerytura);
    }
}
