package Window;

import Player.Player;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JPanel implements ChangeListener, ActionListener
{

    public GameStates gameStates;

    Player player = new Player();
    JFrame frame;
    JLayeredPane creator,menu,battle,pause,info;
    JPanel mainMenu, characterAppearance,characterClass,battleScreen,playerInformation;
    JSlider rSlider, gSlider, bSlider;
    JLabel rgbValue, classes, look,name, classDesc,classInfo, classEquipment;
    JLabel playerIcon;
    private int r,g,b;
    Color currentColor,playerColor;
    JTextField textField;
    JButton finishPlayer, playButton, exitButton;
    JRadioButton mage,rouge,warrior,ranger;

    public Panels()
    {
        gameStates = GameStates.MAIN_MENU;

        //MAIN MENU
        mainMenu = new JPanel();
        mainMenu.setLayout(null);
        mainMenu.setBounds(0,0,900,600);
        mainMenu.setBackground(Color.darkGray);




        //CHARACTER CLASSES
        classes = new JLabel("Classes:");
        classes.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        classes.setPreferredSize(new Dimension(400,20));

        classDesc = new JLabel("");
        classDesc.setFont(new Font("JetBrains Mono",Font.BOLD,13));
        classDesc.setPreferredSize(new Dimension(400,80));
        classEquipment = new JLabel("");
        classEquipment.setFont(new Font("JetBrains Mono",Font.BOLD,13));
        classEquipment.setPreferredSize(new Dimension(200,60));
        classInfo = new JLabel("");
        classInfo.setFont(new Font("JetBrains Mono",Font.BOLD,13));
        classInfo.setPreferredSize(new Dimension(200,60));

        characterClass = new JPanel();
        characterClass.setBounds(0,300,450,300);
        characterClass.setBackground(Color.ORANGE);

        mage = new JRadioButton("Mage");
        mage.addActionListener(this);
        rouge = new JRadioButton("Rouge");
        rouge.addActionListener(this);
        warrior = new JRadioButton("Warrior");
        warrior.addActionListener(this);
        ranger = new JRadioButton("Ranger");
        ranger.addActionListener(this);

        ButtonGroup classType = new ButtonGroup();
        classType.add(mage);
        classType.add(rouge);
        classType.add(warrior);
        classType.add(ranger);

        characterClass.add(classes);
        characterClass.add(mage);
        characterClass.add(rouge);
        characterClass.add(warrior);
        characterClass.add(ranger);
        characterClass.add(classDesc);
        characterClass.add(classEquipment);
        characterClass.add(classInfo);


        //CHARACTER CREATOR
        currentColor = Color.BLACK;
        playerIcon = new JLabel();
        playerIcon.setBounds(50,50,100,100);
        playerIcon.setBackground(currentColor);
        playerIcon.setOpaque(true);


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,50));
        textField.setFont(new Font("Arial",Font.PLAIN,20));

        finishPlayer = new JButton("Finish");
        finishPlayer.addActionListener(this);
        finishPlayer.setPreferredSize(new Dimension(100,50));

        look = new JLabel("Your appearance");
        look.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        look.setPreferredSize(new Dimension(400,50));

        name = new JLabel("Your Name");
        name.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        name.setPreferredSize(new Dimension(150,50));

        rgbValue = new JLabel();
        rgbValue.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        rgbValue.setPreferredSize(new Dimension(400,50));

        rSlider = new JSlider(0,255,0);
        rSlider.setPreferredSize(new Dimension(255,100));
        rSlider.addChangeListener(this);
        gSlider = new JSlider(0,255,0);
        gSlider.setPreferredSize(new Dimension(255,100));
        gSlider.addChangeListener(this);
        bSlider = new JSlider(0,255,0);
        bSlider.setPreferredSize(new Dimension(255,100));
        bSlider.addChangeListener(this);

        rgbValue.setText("R: "+r+"| G: "+g+"| B: "+b);

        characterAppearance = new JPanel();
        characterAppearance.setBounds(450,0,450,600);
        characterAppearance.setBackground(Color.lightGray);
        characterAppearance.add(look);
        characterAppearance.add(rSlider);
        characterAppearance.add(gSlider);
        characterAppearance.add(bSlider);
        characterAppearance.add(rgbValue);
        characterAppearance.add(name);
        characterAppearance.add(textField);
        characterAppearance.add(finishPlayer);


        creator = new JLayeredPane();
        creator.setBounds(0,0,900,600);
        creator.add(characterAppearance);
        creator.add(characterClass);
        creator.add(playerIcon);
        creator.setVisible(false);


        frame = new JFrame();
        frame.add(creator);
        frame.add(menu);
        frame.add(info);
        frame.add(pause);
        frame.add(battle);
        frame.setSize(900,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        while(gameStates==GameStates.CREATOR)
        {
            r = rSlider.getValue();
            g = gSlider.getValue();
            b = bSlider.getValue();
            currentColor = new Color(r,g,b);
            rgbValue.setText("R: "+r+"| G: "+g+"| B: "+b);
            playerIcon.setBackground(currentColor);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == mage)
        {
            classDesc.setText("<html>Mage is medium range class that fights using magic. It's very weak, but his spells does the job done dealing area damage or single opponent damage!</html>");
            setPlayerInfo(player,1);
        }
        else if(e.getSource() == ranger)
        {
            classDesc.setText("<html>Ranger is long range class that fights with his bow and dagger. His long distance makes him perfect for one enemy and his spells can make for more opponents!</html>");
            setPlayerInfo(player,2);
        }
        else if(e.getSource() == rouge)
        {
            classDesc.setText("<html>Rouge is stealthy character that fights in close range. He can attack twice during his action because of his two weapons. Perfect for quick fights and two enemies!</html>");
            setPlayerInfo(player,3);
        }

        else if(e.getSource() == warrior)
        {
            classDesc.setText("<html>Warrior is short range character that can handle more than only few hits and deal big damage using shield and sword. He is perfect for longer fights and handling many enemies!</html>");
            setPlayerInfo(player,4);
        }
        if(e.getSource() == finishPlayer)
        {
            if(!isLetters(textField.getText()) || textField.getText().isEmpty())
            {
                System.out.println("Your name should only include letters and be at least 1 letter long");
            }
            if(player.classChoice==0)
            {
                System.out.println("Please, select a class");
            }
            if(player.classChoice!=0 && isLetters(textField.getText()) && !textField.getText().isEmpty())
            {
                System.out.println(textField.getText());
                player.name = textField.getText();
            }
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
        classEquipment.setText(player.returnEquipment());
        classInfo.setText((player.battleToString()));
    }
}