import Enemy.*;
import Player.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Enemy enemy = new Enemy();
        Enemy[] enemies = new Enemy[3];
        Enemies[] enemyType = new Enemies[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jak masz na imię? ");
        String name = scanner.nextLine();
        int i = 1;
        System.out.println("Wybierz klasę:");
        for (Classes classes: Classes.values())
        {
            if(classes.ordinal()==0)
            {

            }
            else
            {
                System.out.println(i+": "+classes);
                i++;
            }
        }
        int choice = scanner.nextInt();
        Player player = new Player(choice, name);
        player.setEquipment();
        player.updateStats();
        System.out.println(player.toString());
        System.out.println(player.returnEquipment());
    }
}