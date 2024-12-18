public class Mathematics
{
    public static double wyrazenie(int x){
        double wynik = 0;
        double sin = Math.sin(x);
        double cos = Math.cos(x);
        double pow = Math.pow(x,20);

        wynik = Math.ceil(sin+cos*pow);

        return wynik;
    }
}
