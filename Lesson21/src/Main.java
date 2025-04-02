public class Main {
    public static void main(String[] args) {

        Child child1 = new Child();
        Child child2 = new Child();
        Child child3 = new Child();

        System.out.println(Mother.getMotherName());

        child2.mama.motherName = "AnnaLisiecka";
        System.out.println(child1.mama.getMotherName());
        System.out.println(child2.mama.getMotherName());
        System.out.println(child3.mama.getMotherName());
    }
}