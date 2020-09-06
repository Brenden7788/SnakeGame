package game;

/**
 * short description of Head
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class Head {
    Dir direction = Dir.RIGHT;
    int x,y;

    public Head(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dir getDirection() {
        return direction;
    }

    public void setDirection(Dir direction) {
        this.direction = direction;
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
