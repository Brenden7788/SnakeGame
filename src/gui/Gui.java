package gui;

import actions.KeyHandler;

import javax.swing.*;


/**
 * short description of Gui
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class Gui {
    JFrame jf;
    Draw d;
    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    public void create(){
        jf = new JFrame("Snake");
        jf.setSize(width, height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.addKeyListener(new KeyHandler());

        d = new Draw();
        d.setBounds(0,0,width,height);
        d.setVisible(true);

        jf.add(d);
        jf.requestFocus();
        jf.setVisible(true);
    }
}
