package actions;

import game.Dir;
import game.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * short description of KeyHandler
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){

                case KeyEvent.VK_W:
                if(!(Snake.head.getDirection() == Dir.DOWN) && !Snake.waitMoving){
                    Snake.head.setDirection(Dir.UP);
                    Snake.waitMoving = true;
                }
                break;

                case KeyEvent.VK_A:
                if(!(Snake.head.getDirection() == Dir.RIGHT) && !Snake.waitMoving){
                    Snake.head.setDirection(Dir.LEFT);
                    Snake.waitMoving = true;
                }
                break;

                case KeyEvent.VK_S:
                    if(!(Snake.head.getDirection() == Dir.UP) && !Snake.waitMoving){
                        Snake.head.setDirection(Dir.DOWN);
                        Snake.waitMoving = true;
                }
                break;

                case KeyEvent.VK_D:
                    if(!(Snake.head.getDirection() == Dir.LEFT) && !Snake.waitMoving){
                        Snake.head.setDirection(Dir.RIGHT);
                        Snake.waitMoving = true;
                    }
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
