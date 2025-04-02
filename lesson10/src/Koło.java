public class Koło extends Figura
{
    double promien;

    public Koło(double promien) {
        this.promien = promien;
    }

    @Override
    void obliczObwod() {
        super.obliczObwod();
        System.out.println(2*3.14*promien);
    }

    @Override
    void obliczPole() {
        super.obliczPole();
        System.out.println(3.14*(promien*promien));
    }
}
