import java.util.Random;
public class FairDice {
    public int [] sides = new int [11];
    public int counter = 0;
    public void roll() {
        int rand = (int) (Math.random() * 10 + 1);
        sides[rand]++;
        counter++;
    }
    public void reports() {
        System.out.println("Dice has been Rolled " + counter + " times");
        int i = 1;
        while (i <= 10) {
            System.out.println(i + ":>" + sides[i]);
            i++;
        }
    }
}