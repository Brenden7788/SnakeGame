package clocks;

import actions.Collision;
import game.Snake;

import java.util.Collections;

/**
 * short description of GameClock
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while (running){
            try{
                sleep(200);
                Snake.move();
                Snake.waitMoving = false;
                //Kollidierungen
                Collision.colliedPickUp();

                if(Collision.colliedSnake()){
                    Snake.tails.clear();

                    Snake.score = 0;
                }

                //Border
                if(Collision.colliedBorder()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);

                    Snake.score = 0;
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
