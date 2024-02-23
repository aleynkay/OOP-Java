import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Minesweeper {
    private int size; // size of board
    private int nofmines; //number of mines
    private int openCount = 0;
    Btn[][] board;
    JFrame frame = new JFrame("MINESWEEPER");
    JLabel lbl = new JLabel();
    JPanel pnl = new JPanel();
    JPanel boardpnl = new JPanel();

    public Minesweeper(int size,int nofmines) {
        this.size = size;
        this.nofmines= nofmines;
        board = new Btn[size][size];
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        lbl.setFont(new Font("Arial", Font.BOLD,25));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setText("(:     MINESWEEPER     :)");

        for (int row = 0; row <size; row++) {
            for (int col = 0; col < size; col++) {
                Btn b = new Btn(row,col);
                board[row][col] = b;
                b.setFocusable(false);
                b.setMargin(new Insets(0,0,0,0));
                b.setFont(new Font("Arial Unicode MS", Font.PLAIN,30));  //Changes the button font so that our mines or flag emojis appear
                Listener l = new Listener();
                b.addMouseListener(l);
                boardpnl.add(b);
            }
        }
        generateMine();
        updateCount();

        boardpnl.setLayout(new GridLayout(size,size));
        boardpnl.setSize(400,400);
        boardpnl.setBackground(Color.LIGHT_GRAY);
        pnl.setLayout(new BorderLayout());
        pnl.add(lbl);
        frame.add(boardpnl);
        frame.add(pnl, BorderLayout.NORTH);
    }

    public void generateMine() { //set random columns and rows of mines
        int i = 0;
        while (i < nofmines) {
            int randRow = (int) (Math.random() * size);
            int randCol = (int) (Math.random() * size);

            while (board[randRow][randCol].isMine()) { //If the same place occurs, adjust again.
                randRow = (int) (Math.random() * size);
                randCol = (int) (Math.random() * size);
            }
            board[randRow][randCol].setMine(true);
            i++;
        }
    }

    public void updateCount() {  //Counts how many are not around the button
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col].isMine()) {
                    counting(row,col);
                }
            }
        }
    }

    public void counting(int row,int col) {
        for (int i = row-1; i <= row+1; i++) {
            for (int k = col-1; k <= col+1; k++) {
                try {
                    int value = board[i][k].getCount();
                    board[i][k].setCount(++value);
                }
                catch (Exception e) {

                }
            }
        }
    }

    public void print() {
        for (int row = 0; row <size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col].isMine()) {
                    board[row][col].setText("💣");
                }
                else {
                    board[row][col].setText(board[row][col].getCount()+"");
                    board[row][col].setEnabled(false);
                }
            }
        }
    }

    public void open(int row,int col) { //If click on a place where there are no mines, it prints the number of mines around.
        if (row < 0 || col < 0 || row >= size || col >= size || board[row][col].getText().length() > 0 || board[row][col].isEnabled()== false) {
            return;  //If there are undefined rows and columns, return
        }
        else if (board[row][col].getCount() != 0) {  //if there are mines around the button, open the button and print count
            board[row][col].setText(board[row][col].getCount()+"");
            board[row][col].setEnabled(false);
            openCount++;
        }

        else {
            board[row][col].setEnabled(false);  //If there are no mines around the button,opens the buttons around
            open(row-1,col);
            open(row,col-1);
            open(row,col+1);
            open(row+1,col);
            openCount++;
        }
    }

    public class Listener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Btn b = (Btn) e.getComponent();
            if (e.getButton() == 1) { //If the left mouse button
                if (b.isMine()) {
                    JOptionPane.showMessageDialog(frame,"!!Game Over!!");
                    print();
                }
                else {
                    open(b.getRow(), b.getCol());
                    if (openCount == ((size * size) - nofmines)) {
                        JOptionPane.showMessageDialog(frame,"🎉CONGURATULATİONSSS🎉");
                    }
                }
            }
            else if (e.getButton() ==3) { //If the right mouse button
                if (!b.isFlag()) {
                    b.setText("🏴");
                    b.setFlag(true);
                }
                else {
                    b.setText("null");
                    b.setFlag(false);
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}

