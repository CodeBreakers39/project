import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Player {
    int x, dx, y, index=0;
    Image john[] = new Image[8];
    public Player() {
        john[0] = (new ImageIcon("img/1.png").getImage());
        john[1] = (new ImageIcon("img/2.png").getImage());
        john[2] = (new ImageIcon("img/3.png").getImage());
        john[3] = (new ImageIcon("img/4.png").getImage());
        john[4] = (new ImageIcon("img/5.png").getImage());
        john[5] = (new ImageIcon("img/6.png").getImage());
        john[6] = (new ImageIcon("img/7.png").getImage());
        john[7] = (new ImageIcon("img/8.png").getImage());
        x = 0;
        y = 178;
    }
    public void move() {
        x = x + dx;
    }
    public int getX() {
        return x;
    } 
    public int getY() {
        return y;
    }
    public Image getImage() {
        return john[index];
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT){
            dx = -3;
            if(index==0){
                index=8;
            }
            index--;                    
        }                
        if (key == KeyEvent.VK_RIGHT){
            dx = 3;
            index++;
            if(index==8){
                index=0;
            }                       
        }               
    } 
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT){
            dx = 0;
        }               
        if (key == KeyEvent.VK_RIGHT){
            dx = 0;
        }
    }
}