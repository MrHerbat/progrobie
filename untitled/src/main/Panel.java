package main;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel
{
    public Panel()
    {

    }
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);

        graphics.fillRect(200,200,50,50);
    }
}
