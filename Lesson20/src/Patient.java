public class Patient
{
    String firstName;
    String lastName;

    Liver liver;
    Kidney leftKidney;
    Kidney rightKidney;

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    class Kidney
    {
        double price;
        double capacity;
        double weight;

        public Kidney(double price, double capacity, double weight) {
            this.price = price;
            this.capacity = capacity;
            this.weight = weight;
        }
    }

    class Liver
    {
        double price;
        double percentageOfLiverDamage;
        double weight;

        public Liver(double price, double percentageOfLiverDamage, double weight) {
            this.price = price;
            this.percentageOfLiverDamage = percentageOfLiverDamage;
            this.weight = weight;
        }
    }
}
