import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guesser extends JFrame {
    private JButton btn;
    private JLabel lbl;
    private JLabel lbl2;
    private JLabel lbl3;
    private JRadioButton correct;
    private JRadioButton big;
    private JRadioButton small;
    private ButtonGroup btngrp;
    private int newx;
    private int lowerBound = 1;
    private int upperBound = 100;
    public class Btntiklandi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (correct.isSelected()) {
                lbl3.setText("WE DID IT");
            }
            else if (big.isSelected()) {
                upperBound = newx - 1;
                newx = (int) (Math.random() * (upperBound- lowerBound) + lowerBound);
                lbl3.setText("I TRY");
                lbl2.setText("My next guess is "+ newx);
            }
            else if (small.isSelected()) {
                lowerBound = newx + 1;
                newx = (int) (Math.random() * (upperBound- lowerBound) + lowerBound);
                lbl3.setText("I TRY");
                lbl2.setText("My next guess is "+ newx);
            }
        }
    }

    public Guesser() {

        JPanel panel = new JPanel();
        setTitle("NUMBER GUESSER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(666666666));
        panel.setSize(1,3);
        btn = new JButton("Guess");
        btn.setBackground(new Color(66666667));
        correct = new JRadioButton("correct");
        big = new JRadioButton("big");
        small = new JRadioButton("small");
        btngrp= new ButtonGroup();
        btngrp.add(correct);
        btngrp.add(small);
        btngrp.add(big);
        lbl = new JLabel("      YOU PICK AN INTEGER NUMBER BETWEEN 1-100 AND I GUESS IT     ");
        newx = (int) (Math.random()* 100 + 1);
        lbl2 = new JLabel("My first guess is " + newx);
        lbl3 = new JLabel();
        Btntiklandi b = new Btntiklandi();
        btn.addActionListener(b);

        add(lbl);
        panel.add(lbl2);
        panel.add(correct);
        panel.add(small);
        panel.add(big);
        panel.add(lbl3);
        panel.add(btn);
        add(panel);
    }
}
