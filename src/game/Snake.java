package game;

import gui.Gui;

import java.awt.*;
import java.util.ArrayList;

/**
 * short description of Snake
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class Snake {

    public static boolean waitMoving = false;
    public static int score = 0, bestscore = 0;

    public static Head head = new Head(7, 7);
    public static ArrayList<Tail> tails = new ArrayList<>();

    public static PickUp pickUp = new PickUp();

    public static void addTail(){
        if (tails.size() < 1){
            tails.add(new Tail(head.getX(), head.getY()) );
        } else{
            tails.add(new Tail(tails.get(tails.size()-1).x, tails.get(tails.size()-1).y));
        }
    }

    public static void move(){
        //Move Tails
        if(tails.size() >= 2){
            for (int i = tails.size()-1; i >= 1; i--) {
                if(tails.get(i).isWait()){
                    tails.get(i).setWait(false);
                }else{
                    tails.get(i).setX(tails.get(i-1).getX());
                    tails.get(i).setY(tails.get(i-1).getY());
                }
            }
        }

        //Move First Tail to Head
        if(tails.size() >= 1){
            if(tails.get(0).isWait()){
                tails.get(0).setWait(false);
            }else{
                tails.get(0).setX(head.getX());
                tails.get(0).setY(head.getY());
            }
        }

        //Head move
        switch (head.getDirection()){
            case UP:
                head.setY(head.getY()-1);
            break;

            case DOWN:
                head.setY(head.getY()+1);
                break;

            case LEFT:
                head.setX(head.getX()-1);
                break;

            case RIGHT:
                head.setX(head.getX()+1);
                break;
        }

    }

    // ptc = Position to Coordinate
    public static Point ptc(int x, int y){
        Point p = new Point( 0,0);

        p.x = x * 32 + Gui.xoff;
        p.y = y * 32 + Gui.yoff;

        return p;
    }



}
