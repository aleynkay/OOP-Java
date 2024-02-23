import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startpnl extends JFrame {
    private static JRadioButton beginner;
    private static JRadioButton intermediate;
    private static JRadioButton expert;
    public Startpnl() {
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel pl = new JPanel();
        JPanel title = new JPanel();
        JLabel lbl = new JLabel("(:     MINESWEEPER     :)");
        JLabel please = new JLabel("PLEASE SELECT LEVEL     ");
        JButton btn = new JButton("START THE GAME");
        JPanel levels = new JPanel();
        ButtonGroup btngrp = new ButtonGroup();

        levels.setLayout(new GridLayout(3,1));
        pl.setBackground(Color.LIGHT_GRAY);
        pl.setLayout(new GridBagLayout());
        beginner = new JRadioButton("beginner");
        intermediate = new JRadioButton("intermediate");
        expert = new JRadioButton("expert");

        btn.addActionListener(new Butontiklandi());
        levels.add(beginner);
        levels.add(intermediate);
        levels.add(expert);

        btngrp.add(beginner);
        btngrp.add(intermediate);
        btngrp.add(expert);
        title.add(lbl);
        pl.add(please);
        pl.add(levels);
        pl.add(btn);
        add(title,BorderLayout.NORTH);
        add(pl);
        setVisible(true);
    }
    public class Butontiklandi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (beginner.isSelected()) { // Depending on the selected level, the size of the game and the number of mines are determined
                Minesweeper game = new Minesweeper(9, 10);
            }
            else if (intermediate.isSelected()) {
                Minesweeper game = new Minesweeper(15,25);
            }
            else if (expert.isSelected()) {
                Minesweeper game = new Minesweeper(20,40);
            }
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
            frame.dispose(); // startpanel is dead and begin the game
        }
    }
}
