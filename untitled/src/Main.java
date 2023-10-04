import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner(System.in);
//        Player player = new Player(0, 5, 1);
//        System.out.println("What is your name, traveler?");
//        player.playerName = scan.nextLine();
//        System.out.println("Choose your class, " +player.playerName+": \n 1. Warrior \n 2. Ranger \n 3. Wizard \n 4. Rouge");
//        int characterClass = scan.nextInt();
//        player.playerClass.classSelector(characterClass);
//        System.out.println(player.playerClass.className);




        Armory armory = new Armory();

        System.out.println(armory.rustyShortSword.weaponDamageType);
        System.out.println(armory.weaponDamageRandomizer(armory.rustyShortSword));


    }
}