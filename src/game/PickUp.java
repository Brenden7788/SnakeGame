package game;

import java.util.concurrent.ThreadLocalRandom;

/**
 * short description of PickUp
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class PickUp {
    int x,y;

    public PickUp(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }

    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);

        for (int i = 0; i < Snake.tails.size(); i++) {
            if(Snake.tails.get(i).getX() == x || Snake.tails.get(i).getY() == y){
                reset();
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
