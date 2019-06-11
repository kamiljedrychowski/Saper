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

    public boolean check_neighbours(int r, int c, ArrayList<Point> retval){         // funkcja sprawdzająca do odsłonięcia sąsiadów gdzy odkryło się puste pole 0
        if(this.board[r][c] == 9){
            this.end = true;
            return false;
        }
        else{
            this.fields -= 1;
            this.marked[r][c] = 3;
            if(this.board[r][c] == 0){
                for(int rr = r-1; rr<r+2; rr++){
                    for(int cc = c-1; cc<c+2; cc++){
                        if(this.col > cc && cc>=0 && this.row > rr && rr>=0){
                            if(this.marked[rr][cc] != 3){
                                this.check_neighbours(rr,cc,retval);
                            }
                        }
                    }
                }
            }
            retval.add(new Point(r,c));
        }
        return true;
    }

    public boolean won(){                   // funkcja sprawdzająca czy gra została już wygrana
        if(this.fields == this.bombs){
            this.end = true;
            return true;
        }
        else if(this.counter == this.bombs){
            boolean a=false;
            for(int r=0; r<this.row; r++){
                for(int c=0; c<this.col; c++){
                    if(this.board[r][c] == 9 && this.marked[r][c] != 1){
                        a=true;
                        break;
                    }
                }
                if(a) break;
            }
            if(!a){
                this.end = true;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Point> allBombs(){                   // funkcja zwracająca Arrayliste z współrzędnymi wszystkich bomb
        ArrayList<Point> bombs = new ArrayList<>();
        for(int r = 0; r < this.row; r++){
            for(int c = 0; c < this.col; c++){
                if(this.board[r][c]==9)
                    bombs.add(new Point(r,c));
            }
        }
        return bombs;
    }

    public void addMarked(int r, int c){
        this.marked[r][c] ++;
        this.marked[r][c] %= 3;
    }
    public int getMarked(int r, int c){
        return this.marked[r][c];
    }
    public void addCounter(){
        this.counter++;
    }
    public void subCounter(){
        this.counter--;
    }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getBombs() {
        return bombs;
    }
    public int getCounter() {
        return counter;
    }
    public boolean isEnd() {
        return end;
    }
    public int returnValue(int r, int c){
        return this.board[r][c];
    }

}