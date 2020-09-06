package actions;


import clocks.GameClock;
import gui.Gui;

/**
 * short description of Main
 *
 * @author Brenden Jose
 * @version 1.0
 * @since 06.09.2020
 */
public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        GameClock gc = new GameClock();

        gui.create();
        gc.start();
    }
}
