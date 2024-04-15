package GameWindow;

public class Game
{
    private Window window;
    private GamePanel panel;

    public Game()
    {
        panel = new GamePanel();
        window = new Window(panel);
    }
}
