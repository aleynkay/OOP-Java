public class Referee {
    Player player1 = new Player();
    Player player2 = new Player();
    public void PlayTheGame() {
        // 0 = rock, 1 = paper, 2 = scissors
        while (player1.points < 3 && player2.points < 3) {
            System.out.print("first player: ");
            player1.play();
            System.out.print("second player: ");
            player2.play();
            if (player1.N1.value == 0 && player2.N1.value == 2) {
                player1.points++;
            }
            else if (player1.N1.value == 0 && player2.N1.value == 1) {
                player2.points++;
            }
            else if (player1.N1.value == 1 && player2.N1.value == 2) {
                player2.points++;
            }
            else if (player1.N1.value == 1 && player2.N1.value == 0) {
                player1.points++;
            }
            else if (player1.N1.value == 2 && player2.N1.value == 0) {
                player2.points++;
            }
            else if (player1.N1.value == 2 && player2.N1.value == 1) {
                player1.points++;
            }
            System.out.println("scores: " + player1.points + "-" +player2.points);
        }
        if (player1.points > player2.points) {
            System.out.println("WINNER IS THE FIRST PLAYER");
        }
        else if (player2.points > player1.points) {
            System.out.println("WINNER IS THE SECOND PLAYER");
        }
    }
}
