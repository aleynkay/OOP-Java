public class Main {
    public static void main(String[] args) {
        MarbleJar m1 = new MarbleJar();
        m1.addMarble(3);
        m1.openLid();
        m1.addMarble(4);
        m1.addMarble(7);
        m1.closeLid();
        m1.removeMarble(3);
        m1.openLid();
        m1.removeMarble(3);
        m1.removeMarble(5);
        m1.removeMarble(4);
    }
}
