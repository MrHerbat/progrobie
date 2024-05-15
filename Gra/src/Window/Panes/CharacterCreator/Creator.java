package Window.Panes.CharacterCreator;

import javax.swing.*;
import java.awt.*;

public class Creator extends JPanel
{
    public JTextField textField;
    public JButton finishPlayer;
    public JLabel look,name,rgbValue;
    public JSlider rSlider,gSlider,bSlider;
    public JPanel characterAppearance;
    public Creator()
    {
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,50));
        textField.setFont(new Font("Arial",Font.PLAIN,20));

        finishPlayer = new JButton("Finish");
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
        gSlider = new JSlider(0,255,0);
        gSlider.setPreferredSize(new Dimension(255,100));
        bSlider = new JSlider(0,255,0);
        bSlider.setPreferredSize(new Dimension(255,100));


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
    }
}
