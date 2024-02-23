public class Player {
    public int points = 0;
    Name N1 = new Name();
    public void play() {
        N1.Game();
        if (N1.value == 0) {
            System.out.println("Rock");
        }
        else if (N1.value == 1) {
            System.out.println("Paper");
        }
        else if (N1.value == 2) {
            System.out.println("Scissors");
        }
    }
}
