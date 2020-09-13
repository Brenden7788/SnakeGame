package gui;

import game.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * short description of Draw
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class Draw extends JLabel {

    Point p;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        //Draw the background
        g.setColor(Color.BLACK);
        g.fillRect(0,0, Gui.width, Gui.height);
        
        //Draw Grid
        g.setColor(Color.GRAY);
        for (int i = 0; i < 16 ; i++) {
            for (int j = 0; j < 16; j++) {
                g.drawRect(i * 32 + Gui.xoff, j * 32 + Gui.yoff , 32, 32);
            }
        }

        //Draw Snake Tails
        g.setColor(new Color(0, 181,26));
        for (int i = 0; i < Snake.tails.size(); i++) {
            p = Snake.ptc(Snake.tails.get(i).getX(),Snake.tails.get(i).getY());
            g.fillRect(p.x, p.y,32,32);
        }

        //Draw Head
        g.setColor(new Color(0,137,182));
        p = Snake.ptc(Snake.head.getX(), Snake.head.getY());
        g.fillRect(p.x,p.y,32,32);

        //DrawPickup
        g.setColor(new Color(134,26,34));
        p = Snake.ptc(Snake.pickUp.getX(),Snake.pickUp.getY());
        g.fillRect(p.x, p.y , 32,32);

        //Draw Border
        g.setColor(Color.WHITE);
        g.drawRect(Gui.xoff, Gui.yoff, 512, 512);

        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: "+Snake.score, 5,25);
        g.drawString("Best Score: "+Snake.bestscore, 5, 50);

        repaint();
    }

}
