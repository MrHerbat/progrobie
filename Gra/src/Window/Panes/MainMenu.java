package Window.Panes;

import javax.swing.*;
import java.awt.*;



public class MainMenu extends JPanel
{
    public JPanel buttonArea, titleArea;
    JLabel title;
    public JButton exitButton, playButton;
    public MainMenu()
    {
        buttonArea = new JPanel();
        buttonArea.setBounds(350,200,200,300);
        buttonArea.setBackground(Color.darkGray);

        titleArea = new JPanel();
        titleArea.setBounds(200,0,500,50);
        titleArea.setBackground(Color.darkGray);

        title = new JLabel("<html>Gra o kwadracie</html>");
        title.setFont(new Font("JetBrains Mono",Font.ITALIC,40));
        title.setForeground(Color.cyan);

        titleArea.add(title);

        playButton = new JButton("Play");
        playButton.setPreferredSize(new Dimension(150,75));

        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(150,75));



        buttonArea.add(playButton);
        buttonArea.add(exitButton);
    }
}
