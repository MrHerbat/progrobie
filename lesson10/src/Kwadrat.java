public class Kwadrat extends Figura
{
    double wysokosc;

    public Kwadrat(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    void obliczObwod() {
        super.obliczObwod();
        System.out.println(wysokosc*4);
    }

    @Override
    void obliczPole() {
        super.obliczPole();
        System.out.println(wysokosc*wysokosc);
    }
}
