package game;

/**
 * short description of Tail
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class Tail {
    int x,y;
    boolean wait = true;

    public Tail(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean isWait() {
        return wait;
    }

    public void setWait(boolean wait) {
        this.wait = wait;
    }
}
