// package main;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameScreen extends JPanel {

    private Game game;
    private Dimension size;
    private Render render;

    public GameScreen(Game game) {
        this.game = game;
        render = new Render(this);

        setPanelSize();

    }

    private void setPanelSize() {
        size = new Dimension(640, 640);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        render.render(g);

    }

}
