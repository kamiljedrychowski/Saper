package packagee;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Game implements IGame {

    int row;        // rzędy
    int col;        // kolumny
    int bombs;      // ilość bomb
    int fields;     // liczba pól nieodkrytych
    int counter;    // liczba zaznaczonych pól
    boolean end;    // boolean czy gra jest zakończona

    int [][]board;  // tablica pól z ich wartościami 0-8 9 - bomba
    int [][]marked; // tablica pól z ich aktualnym stanem 0-normalny 1-f. jest b 2-f. może być b 3-odkryte

    public int getCounter() {
        return 0;
    }

    public int getRow() {
        return 0;
    }

    public int getCol() {
        return 0;
    }

    public int getBombs() {
        return 0;
    }

    public boolean isEnd() {
        return false;
    }

    public int returnValue(int r, int c) {
        return 0;
    }

    public boolean check_neighbours(int r, int c, ArrayList<Point> retval) {
        return false;
    }

    public boolean won() {
        return false;
    }

    public ArrayList<Point> allBombs() {
        return null;
    }

    public void addMarked(int r, int c) {

    }

    public int getMarked(int r, int c) {
        return 0;
    }

    public void addCounter() {

    }

    public void subCounter() {

    }
}