public enum Animal
{
    CAT(2),
    DOG(25f,3);

    private int age;
    private double weight;

    Animal(int age)
    {
        this.setAge(age);
    }

    Animal(double weight,int age) {
        this.age = age;
        this.weight = weight;
    }
    @Override
    public String toString()
    {
        return "age:"+this.age+" weight:"+this.weight+" ordinal:"+this.ordinal();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
