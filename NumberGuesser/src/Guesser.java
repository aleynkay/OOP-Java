import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guesser extends JFrame {
    private JButton btn;
    private JLabel lbl;
    private JTextField txt;
    private JLabel lbl2;
    private JLabel lbl3;
    private int x;
    private int count = 0;

    public class Btntiklandi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int guess = Integer.parseInt(txt.getText());
            count++;
            if (guess  == x) {
                lbl2.setText("Your  guess is CORRECT");
                lbl3.setText("You find it in " + count + " Turns");
            }
            else if (guess > x) {
                lbl2.setText("Your guess is big");
            }
            else {
                lbl2.setText("Your guess is small");
            }
        }
    }
    public Guesser () {
        JPanel panel = new JPanel();
        setTitle("NUMBER GUESSER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(666666666));
        panel.setSize(50,50);
        x = (int) (Math.random() *100 +1);
        lbl = new JLabel("       I PICK AN INTEGER NUMBER BETWEEN 1-100 AND YOU GUESS IT     ");
        btn = new JButton("GUESS");
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        btn.setBackground(new Color(66666653));
        txt = new JTextField(25);
        Btntiklandi b = new Btntiklandi();
        btn.addActionListener(b);
        add(lbl);
        panel.add(txt);
        panel.add(btn);
        panel.add(lbl2);
        panel.add(lbl3);
        add(panel);
    }
}
