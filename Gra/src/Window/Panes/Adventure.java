package Window.Panes;

import javax.swing.*;
import java.awt.*;

public class Adventure extends JPanel
{
    public JPanel adven,playerInformation;
    public JLabel playerContainer,playerStatsInfo,campfireLabel;
    public JButton fight, showInfo,back,backToMenu;
    ImageIcon campfire;
    public Adventure()
    {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        campfire = new ImageIcon("src/Resources/campfire.png");
        campfireLabel = new JLabel();
        campfireLabel.setBounds(0,250,200,200);
        campfireLabel.setIcon(campfire);

        showInfo = new JButton("Player");
        showInfo.setPreferredSize(new Dimension(100,50));
//        showInfo.setBounds(100,0,100,100);

        fight = new JButton("Go Fight");
        fight.setPreferredSize(new Dimension(100,50));
//        fight.setBounds(0,0,100,50);

        back = new JButton("Back");
        back.setPreferredSize(new Dimension(100,50));

        adven = new JPanel();
        adven.setBounds(300,0,600,600);
        adven.setLayout(new GridBagLayout());
        c.insets = new Insets(0,0,0,20);
        c.gridx = 0;
        c.gridy = 0;
        adven.add(fight,c);
        c.gridx = 1;
        c.gridy = 0;
        adven.add(showInfo,c);
        c.gridx = 0;
        c.gridy = 1;
        adven.add(campfireLabel,c);


        playerContainer = new JLabel("");
        playerContainer.setPreferredSize(new Dimension(300,100));

        playerStatsInfo = new JLabel("");
        playerStatsInfo.setPreferredSize(new Dimension(300,300));
        playerStatsInfo.setForeground(Color.white);


        playerInformation = new JPanel();
        playerInformation.setBounds(0,0,300,600);
        playerInformation.add(playerContainer);
        playerInformation.add(playerStatsInfo);
        playerInformation.add(back);
        playerInformation.setBackground(Color.DARK_GRAY);
        playerInformation.setVisible(false);
    }
}
