import java.util.Random;
public class UnfairDice {
    public int sides[] = new int[10];
    public int counter;
    public void roll() {
        int x = (int) (Math.random() * 100);
        if(x > 70) {
            sides[9]++;
        }
        else if (x > 60) {
            sides[8]++;
        }
        else if (x > 55) {
            sides[7]++;
        }
        else if (x > 50) {
            sides[6]++;
        }
        else if (x > 45) {
            sides[5]++;
        }
        else if (x > 40) {
            sides[4]++;
        }
        else if (x > 35) {
            sides[3]++;
        }
        else if (x > 15) {
            sides[2]++;
        }
        else if (x > 5) {
            sides[1]++;
        }
        else {
            sides[0]++;
        }
        counter++;
    }
    public void reports() {
        System.out.println("Dice has been Rolled" + counter + "times");
        int i = 0;
        while (i <= 9) {
            System.out.println((i+1) + ":>" + sides[i]);
            i++;
        }
    }
}