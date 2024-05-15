package Window;

import Player.Player;
import Window.Panes.Adventure;
import Window.Panes.CharacterCreator.CharacterClasses;
import Window.Panes.CharacterCreator.Creator;
import Window.Panes.MainMenu;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JPanel implements ChangeListener, ActionListener
{
    MainMenu mainMenu;
    Adventure adventurePanel;
    Creator characterCreator;
    CharacterClasses characterClasses;
    private boolean adv;
    Player player = new Player();
    JFrame frame;
    JLayeredPane creator,menu,battle,adventure,map;
    JPanel battleScreen,battleOptions,mapPanel;
    JLabel  classes, look,name, classDesc,classInfo, classEquipment,enemyName, playerName,combatAction;
    JLabel playerIcon;
    private int r,g,b, playerPosX = 75,playerPosY = 75;
    Color currentColor,playerColor;
    JButton attack,spells,stepBack,stepFor,escape;


    public Panels()
    {
        //MAIN MENU
        mainMenu = new MainMenu();
        menu = new JLayeredPane();
        menu.setBounds(0,0,900,600);
        menu.add(mainMenu.buttonArea);
        menu.add(mainMenu.titleArea);

        mainMenu.exitButton.addActionListener(this);
        mainMenu.playButton.addActionListener(this);

        //PLAYER ICON
        currentColor = Color.BLACK;
        playerIcon = new JLabel();
        playerIcon.setBounds(playerPosX,playerPosY,100,100);
        playerIcon.setBackground(currentColor);
        playerIcon.setOpaque(true);
        playerIcon.setVisible(false);

        //ADVENTURE MENU
        adventurePanel = new Adventure();

        adventurePanel.fight.addActionListener(this);
        adventurePanel.showInfo.addActionListener(this);
        adventurePanel.back.addActionListener(this);


        adventure = new JLayeredPane();
        adventure.setBounds(300,0,600,600);
        adventure.add(adventurePanel.adven);
        adventure.add(adventurePanel.playerInformation);
        adventure.setVisible(false);


        //BATTLE MENU


        //CHARACTER CLASSES
        characterClasses = new CharacterClasses();

        characterClasses.mage.addActionListener(this);
        characterClasses.rouge.addActionListener(this);
        characterClasses.warrior.addActionListener(this);
        characterClasses.ranger.addActionListener(this);


        //CHARACTER CREATOR
        characterCreator = new Creator();

        characterCreator.finishPlayer.addActionListener(this);

        characterCreator.rSlider.addChangeListener(this);
        characterCreator.gSlider.addChangeListener(this);
        characterCreator.bSlider.addChangeListener(this);

        characterCreator.rgbValue.setText("R: "+r+"| G: "+g+"| B: "+b);


        creator = new JLayeredPane();
        creator.setBounds(0,0,900,600);
        creator.add(characterCreator.characterAppearance);
        creator.add(characterClasses.characterClass);
        creator.setVisible(false);

        //FRAME
        frame = new JFrame();
        frame.add(playerIcon);
        frame.add(creator);
        frame.add(menu);
        frame.add(adventure);
//        frame.add(info);
//        frame.add(pause);
//        frame.add(battle);
        frame.setSize(900,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        if(adv)
        {
            player.updateStats();
            adv = false;
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
            r = characterCreator.rSlider.getValue();
            g = characterCreator.gSlider.getValue();
            b = characterCreator.bSlider.getValue();
            currentColor = new Color(r,g,b);
            characterCreator.rgbValue.setText("R: "+r+"| G: "+g+"| B: "+b);
            playerIcon.setBackground(currentColor);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == mainMenu.playButton)
        {
            menu.setVisible(false);
            creator.setVisible(true);
            playerIcon.setVisible(true);
        }
        if(e.getSource() == mainMenu.exitButton)
        {
            System.exit(0);
        }

        if(e.getSource() == characterClasses.mage)
        {
            characterClasses.classDesc.setText("<html>Mage is medium range class that fights using magic. It's very weak, but his spells does the job done dealing area damage or single opponent damage!</html>");
            setPlayerInfo(player,1);
        }
        else if(e.getSource() == characterClasses.ranger)
        {
            characterClasses.classDesc.setText("<html>Ranger is long range class that fights with his bow and dagger. His long distance makes him perfect for one enemy and his spells can make for more opponents!</html>");
            setPlayerInfo(player,2);
        }
        else if(e.getSource() == characterClasses.rouge)
        {
            characterClasses.classDesc.setText("<html>Rouge is stealthy character that fights in close range. He can attack twice during his action because of his two weapons. Perfect for quick fights and two enemies!</html>");
            setPlayerInfo(player,3);
        }

        else if(e.getSource() == characterClasses.warrior)
        {
            characterClasses.classDesc.setText("<html>Warrior is short range character that can handle more than only few hits and deal big damage using shield and sword. He is perfect for longer fights and handling many enemies!</html>");
            setPlayerInfo(player,4);
        }
        if(e.getSource() == characterCreator.finishPlayer)
        {
            if(!isLetters(characterCreator.textField.getText()) || characterCreator.textField.getText().isEmpty())
            {
                System.out.println("Your name should only include letters and be at least 1 letter long");
            }
            if(player.classChoice==0)
            {
                System.out.println("Please, select a class");
            }
            if(player.classChoice!=0 && isLetters(characterCreator.textField.getText()) && !characterCreator.textField.getText().isEmpty())
            {
                playerColor = currentColor;
                playerIcon.setBackground(playerColor);
                System.out.println(characterCreator.textField.getText());
                player.name = characterCreator.textField.getText();
                creator.setVisible(false);
                adventure.setVisible(true);
                playerIcon.setVisible(false);
                adventurePanel.playerStatsInfo.setText(player.toString());
                adv = true;
            }
        }
        if(e.getSource() == adventurePanel.showInfo)
        {
            playerPosX = 100;
            playerPosY = 50;
            playerIcon.setBounds(playerPosX,playerPosY,100,100);
            adventurePanel.playerInformation.setVisible(true);
            playerIcon.setVisible(true);
            adventurePanel.playerStatsInfo.setText(player.returnAll());
        }
        if(e.getSource() == adventurePanel.back)
        {
            adventurePanel.playerInformation.setVisible(false);
            playerIcon.setVisible(false);
        }
    }



    public boolean isLetters(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public void setPlayerInfo(Player player, int choice)
    {
        player.classChoice = choice;
        player.setEquipment();
        player.updateStats();
        characterClasses.classEquipment.setText(player.returnEquipment());
        characterClasses.classInfo.setText((player.creatorToString()));
    }
}
