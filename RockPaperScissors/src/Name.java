import java.util.Random;
public class Name {
    public int value = 0;
    public void Game() {
        value = (int) (Math.random() * 3);
    }
    public int getValue() {
        return (value);
    }
}