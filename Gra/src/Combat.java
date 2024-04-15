import Enemy.*;
import Player.*;

import java.util.Scanner;

public class Combat
{
    private boolean playerTurn = true, enemyTurn = false, endedTurn=false;
    private Player battlePlayer;
    private Enemy enemy;
    private int distance;
    private int actionChoice, defAdder;
    private boolean leaveCombat = false;
    private int playerDef,playerAtkRange,playerAtk,playerPen,playerHp,playerRange1,enemyDef, enemyAtkRange,enemyDmg,enemyPen,enemyRange,enemyHp, exp;

    public void startEncounter(Player player)
    {
        actionChoice = 0;
        distance = (int)(Math.random()*5)+3;
        battlePlayer = player;
        Scanner scanner = new Scanner(System.in);
        enemy = new Enemy();
        enemy.enemyHolder = enemy.randomEnemy();
        enemy.returnEnemyStats(enemy.enemyHolder);
        enemyDef=enemy.getDef();
        enemyAtkRange =enemy.getDmgRange();
        enemyPen=enemy.getPen();
        enemyRange=enemy.getRange();
        enemyHp = enemy.getCurrentHp();

        if(player.equipment.armorsOffHand!=null)
        {
            enemyDef=player.equipment.armor.getDef()+player.equipment.armorsOffHand.getDef();
        }
        else
        {
            enemyDef=player.equipment.armor.getDef();
        }
        playerDef = player.equipment.mainHand.getPen();
        playerRange1=player.equipment.mainHand.getRange();
        playerAtkRange=player.equipment.mainHand.getDmgRange();
        playerHp = player.currentHp;

        if(player.getSpeed()<enemy.getSpeed())
        {
            playerTurn = false;
            enemyTurn = true;
        }
        else
        {
            playerTurn = true;
            enemyTurn = false;
        }
        endedTurn = false;
        while(!leaveCombat)
        {
            endedTurn = false;
            System.out.println(enemy.toString());
            System.out.println("| "+distance+" | (distance)");
            System.out.println(player.battleToString());
            if(playerTurn && !endedTurn)
            {
                playerTurn=false;
                enemyTurn=true;
                endedTurn = true;
                if(playerRange1<=distance)
                {
                    System.out.println("1. Step Forward \n2. Increase Defense\n3. Wait\n4. Run");
                    actionChoice = scanner.nextInt();
                    switch (actionChoice)
                    {
                        case 1:
                            distance--;
                            System.out.println("\nYou step towards "+enemy.enemyHolder+"\n");
                            break;
                        case 2:
                            defAdder++;
                            break;
                        case 3:
                            break;
                        case 4:
                            leaveCombat = true;
                            break;
                        default:
                            System.out.println("There's no action, your turn has been skipped!");
                            break;
                    }
                }
                else
                {
                    System.out.println("1. Step Backwards \n2. Increase Defense\n3. Attack\n4. Wait");
                    actionChoice = scanner.nextInt();
                    switch (actionChoice)
                    {
                        case 1:
                            distance++;
                            System.out.println("\nYou step back from "+enemy.enemyHolder+"\n");
                            break;
                        case 2:
                            defAdder++;
                            break;
                        case 3:
                            if (enemy.getDef()-player.equipment.mainHand.getPen()<=0)
                            {
                                playerAtk=(int)(Math.random()*playerAtkRange)+2;
                                enemyHp-=playerAtk;
                                enemy.currentHp=enemyHp;
                                System.out.println("\nYou hit "+enemy.enemyHolder+" for "+playerAtk+" dmg!\n");
                            }
                            else
                            {
                                playerAtk=(int)(Math.random()*playerAtkRange);
                                enemyHp-=playerAtk;
                                enemy.currentHp=enemyHp;
                                System.out.println("\nYou hit "+enemy.enemyHolder+" for "+playerAtk+" dmg!\n");
                            }
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("There's no action, your turn has been skipped!");
                            break;
                    }
                }

            } else if (enemyTurn && !endedTurn) {
                enemyTurn = false;
                playerTurn=true;
                endedTurn = true;
                if(enemy.getRange()<distance)
                {
                    distance--;
                    System.out.println("\n"+enemy.enemyHolder+" steps towards you\n");
                }
                else
                {
                    if(playerDef<enemyPen)
                    {
                        enemyDmg=(int)(Math.random()*enemyAtkRange)+2;
                        playerHp-= enemyDmg;
                        player.currentHp=playerHp;
                        System.out.println("\nYou got hit for "+enemyDmg+" dmg!\n");
                    }
                    else
                    {
                        enemyDmg=(int)(Math.random()*enemyAtkRange)+2;
                        if(enemyDmg<=0)
                        {
                            playerHp-=1;
                            System.out.println("\nYou got hit for 1 dmg!\n");
                        }
                        else
                        {
                            playerHp-=enemyDmg;
                            System.out.println("\nYou got hit for "+enemyDmg+" dmg!\n");
                        }

                        player.currentHp=playerHp;
                    }
                }
            }
            if(enemyHp<=0){
                break;
            }
            if(playerHp<=0)
            {
                break;
            }
        }
        if(player.currentHp<=0)
        {
            System.out.println("You died");
            Main.exit = true;
        }
        if(enemy.getCurrentHp()<=0)
        {
            System.out.println("You won the battle!");
            exp = enemy.returnExp(enemy.enemyHolder);
            System.out.println("You gained "+exp+" exp!");
            player.exp+=exp;
        }
    }
}
