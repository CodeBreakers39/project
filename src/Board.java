import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Board extends JPanel implements ActionListener {
    Player p;
    public Image img;
    Timer time;
    public Board() {
        p = new Player();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("img/test.jpg");
        img = i.getImage();
        time = new Timer(15, this);
        time.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        p.move();
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(img, 0, 0, this);
        g2d.drawImage(p.getImage(), p.getX(), p.getY(), this);
    }
    private class AL extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
                p.keyReleased(e);
        }
        @Override
        public void keyPressed(KeyEvent e) {
                p.keyPressed(e);
        }
    }
}