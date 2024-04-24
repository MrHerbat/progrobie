public class Circle extends Shape
{
    double radius;

    @Override
    public void calculateArea()
    {
        System.out.println("Area of this circle is equal to "+(Math.PI*(radius*radius)));
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
