import java.util.Random;
public class Dice {
    public int lastValue = 0;
    public void Roll() {
        lastValue = (int) (Math.random() * 6 + 1);
    }
    public int getLastValue() {
        return (lastValue);
    }
}