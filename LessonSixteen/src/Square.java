public class Square extends Shape
{
    double sideA,sideB;

    @Override
    public void calculateArea()
    {
        System.out.println("Area of this square is equal to "+sideA*sideB);
    }
    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
