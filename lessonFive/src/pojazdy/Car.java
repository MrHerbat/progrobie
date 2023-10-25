package pojazdy;

import java.util.Scanner;

public class Car
{
    double[] turnAngle;
    String[] turnDirection;
    int amountOfTurns;
    double[] distanceBetweenTurns;

    public void raceway()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many turn there are in the raceway?(number) ");
        amountOfTurns = scan.nextInt();
        int i = amountOfTurns;
        distanceBetweenTurns = new double[i];
        turnDirection = new String[i];
        turnAngle = new double[i];
        for(i=0;i<amountOfTurns;i++)
        {
            System.out.print("Distance between turns(straight line): ");
            distanceBetweenTurns[i] = scan.nextDouble();
            System.out.print("Turn direction(left/right): ");
            turnDirection[i] = scan.next();
            System.out.print("Turn angle: ");
            turnAngle[i] = scan.nextDouble();
        }
        for(i=0;i<amountOfTurns;i++)
        {
            System.out.println("car goes forward for "+distanceBetweenTurns[i]+" meters");
            System.out.println("car turns "+turnDirection[i]+" by "+turnAngle[i]+" degrees");

        }
    }

    public void turnRight(int a)
    {
        System.out.println("car turns right by "+a+" degrees");
    }
    public void turnLeft(int a)
    {
        System.out.println("car turns left by "+a+" degrees");
    }
    public void forward(int a)
    {
        System.out.println("car goes forward for "+a+" meters");
    }

    public Car()
    {

    }
}
