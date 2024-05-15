package Window.Panes.CharacterCreator;

import javax.swing.*;
import java.awt.*;

public class CharacterClasses extends JPanel
{
    public JRadioButton mage,rouge,warrior,ranger;
    public JLabel classes,classDesc,classEquipment,classInfo;
    public JPanel characterClass;
    public CharacterClasses()
    {
        classes = new JLabel("Classes:");
        classes.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        classes.setPreferredSize(new Dimension(400,20));

        classDesc = new JLabel("");
        classDesc.setFont(new Font("JetBrains Mono",Font.BOLD,13));
        classDesc.setPreferredSize(new Dimension(400,80));
        classEquipment = new JLabel("");
        classEquipment.setFont(new Font("JetBrains Mono",Font.BOLD,13));
        classEquipment.setPreferredSize(new Dimension(200,80));
        classInfo = new JLabel("");
        classInfo.setFont(new Font("JetBrains Mono",Font.BOLD,13));
        classInfo.setPreferredSize(new Dimension(200,60));

        characterClass = new JPanel();
        characterClass.setBounds(0,300,450,300);
        characterClass.setBackground(Color.ORANGE);

        mage = new JRadioButton("Mage");
        rouge = new JRadioButton("Rouge");
        warrior = new JRadioButton("Warrior");
        ranger = new JRadioButton("Ranger");

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
    }
}
