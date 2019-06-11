package packagee;

public class GMode extends Game {


    public void addMarked(int r, int c) {
        if (this.board[r][c] == 9) {
            this.marked[r][c]++;
            if (this.marked[r][c] == 8)
                this.marked[r][c] = 5;
        } else {
            this.marked[r][c]++;
            this.marked[r][c] %= 3;
        }
    }

    public boolean won() {                   // funkcja sprawdzająca czy gra została już wygrana
        if (this.fields == this.bombs) {
            this.end = true;
            return true;
        } else if (this.counter == this.bombs) {
            boolean a = false;
            for (int r = 0; r < this.row; r++) {
                for (int c = 0; c < this.col; c++) {
                    if (this.board[r][c] == 9 && this.marked[r][c] != 6) {
                        a = true;
                        break;
                    }
                }
                if (a) break;
            }
            if (!a) {
                this.end = true;
                return true;
            }
        }
        return false;
    }


}