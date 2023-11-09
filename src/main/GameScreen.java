package main;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import inputs.KeyboardLister;
import inputs.MyMouseLister;

public class GameScreen extends JPanel {

    private Game game;
    private Dimension size;

    private MyMouseLister myMouseLister;
    private KeyboardLister KeyboardLister;

    public GameScreen(Game game) {
        this.game = game;

        setPanelSize();

    }

    public void initInputs() {
        myMouseLister = new MyMouseLister(game);
        KeyboardLister = new KeyboardLister(game);

        addMouseListener(myMouseLister);
        addMouseMotionListener(myMouseLister);
        addKeyListener(KeyboardLister);

        requestFocus();
    }

    private void setPanelSize() {
        size = new Dimension(640, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        game.getRender().render(g);

    }

}
