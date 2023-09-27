import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Player player = new Player(0, 5, 1);
        System.out.println("What is your name, traveler?");
        player.playerName = scan.nextLine();
        System.out.println("Choose your class, " +player.playerName+": \n 1. Warrior \n 2. Ranger \n 3. Wizard \n 4. Rouge");
        int characterClass = scan.nextInt();
        switch (characterClass)
        {
            case(1):
                player.playerClass.className = "Warrior";
                player.playerClass.hitPoints = 10f;
                player.playerClass.maxHitPoints = 10f;
                player.playerClass.endurance = 3;
                player.playerClass.strength = 4;
                player.playerClass.charisma = 2;
                player.playerClass.dexterity = 1;
                player.playerClass.intelligence = 1;
                player.playerClass.speed = 1f;
                break;
            case(2):
                player.playerClass.className = "Ranger";
                player.playerClass.hitPoints = 9f;
                player.playerClass.maxHitPoints = 9f;
                player.playerClass.endurance = 1;
                player.playerClass.strength = 3;
                player.playerClass.charisma = 1;
                player.playerClass.dexterity = 4;
                player.playerClass.intelligence = 2;
                player.playerClass.speed = 2f;
                break;
            case(3):
                player.playerClass.className = "Wizard";
                player.playerClass.hitPoints = 6f;
                player.playerClass.maxHitPoints = 6f;
                player.playerClass.endurance = 2;
                player.playerClass.strength = 1;
                player.playerClass.charisma = 3;
                player.playerClass.dexterity = 2;
                player.playerClass.intelligence = 4;
                player.playerClass.speed = 1.5f;
                break;
            case(4):
                player.playerClass.className = "Rouge";
                player.playerClass.hitPoints = 8f;
                player.playerClass.maxHitPoints = 8f;
                player.playerClass.endurance = 2;
                player.playerClass.strength = 2;
                player.playerClass.charisma = 3;
                player.playerClass.dexterity = 4;
                player.playerClass.intelligence = 1;
                player.playerClass.speed = 3f;
                break;
        }
    }
}