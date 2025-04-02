public class TrojmianKwadratowy
{
    double delta;
    double a;
    double b;
    double c;
    double calculateDelta(double a, double b, double c)
    {
        delta = (b*b)-4*(a*c);
        return delta;
    }
}
