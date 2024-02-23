import javax.swing.*;

public class Btn  extends JButton {
    private int row,col,count;
    private boolean mine, flag;

    public Btn(int row, int col) {
        this.row = row;
        this.col = col;
        this.count = 0;
        this.mine = false;
        this.flag = false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCount() { //number of the mines of around the button
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMine() { //Is there mine in button
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isFlag() { // ıs there flag in button
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
