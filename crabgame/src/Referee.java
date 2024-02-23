public class Referee {
    Player Player1 = new Player();
    Player Player2 = new Player();
    public int Round = 1;
    public void PlaytheGame() {
        int flag;
        int goalpl1;
        int goalpl2;
        //round 1
        System.out.println("******" + Round + ". Round******");
        System.out.println("*FIRST PLAYER*");
        Player1.RollDices();
        flag = FirstCheckWinner(Player1);
        if (flag == 2) {
            System.out.println("First player won");
            Player1.score++;
        }
        else if (flag == 1) {
            System.out.println("First player lost");
        }
        System.out.println("*SECOND PLAYER*");
        Player2.RollDices();
        flag = FirstCheckWinner(Player2);
        if (flag == 2) {
            System.out.println("Second player won");
            Player2.score++;
        }
        else if (flag == 1) {
            System.out.println("Second player lost");
        }
        System.out.println("scores = " + Player1.score + "-" + Player2.score);
        //round 2
        if (Player1.score == Player2.score) {
            Round++;
            while (Player1.score < 5 && Player2.score < 5 && Player1.GoalDiceTotal != 7 && Player2.GoalDiceTotal != 7) {
                System.out.println("******" + Round + ".Round******");
                System.out.println("*FIRST PLAYER*");
                goalpl1 = Player1.GoalDiceTotal;
                System.out.println("goal is = " + goalpl1);
                Player1.RollDices();
                if (goalpl1 == Player1.Dice1.getLastValue() + Player1.Dice2.getLastValue() && Player1.GoalDiceTotal != 7 && Player2.GoalDiceTotal != 7) {
                    Player1.score++;
                    System.out.println("First player won");
                } else {
                    System.out.println("First player lost");
                }
                System.out.println("*SECOND PLAYER*");
                goalpl2 = Player2.GoalDiceTotal;
                System.out.println("goal is = " + goalpl2);
                Player2.RollDices();
                if (goalpl2 == Player2.Dice1.getLastValue() + Player2.Dice2.getLastValue() && Player1.GoalDiceTotal != 7 && Player2.GoalDiceTotal != 7) {
                    Player2.score++;
                    System.out.println("Second player won");
                } else {
                    System.out.println("Second player lost");
                }
                System.out.println("scores = " + Player1.score + "-" + Player2.score);
                Round++;
            }
        }
        System.out.println("******GAME OVER******");
        if (Player1.score > Player2.score) {
            System.out.println("WINNER IS FIRST PLAYER");
        }
        else if (Player2.score > Player1.score){
            System.out.println("WINNER IS SECOND PLAYER");
        }
        else {
            System.out.println("WINNER ARE THE BOTH");
        }
    }
    public int FirstCheckWinner(Player pl) {
        if(pl.Dice1.getLastValue() == 6 && pl.Dice2.getLastValue() == 6) {
            return 2;
        }
        else if (pl.Dice1.getLastValue() == 5 && pl.Dice2.getLastValue() == 5) {
            return 2;
        }
        else if (pl.Dice1.getLastValue() == 3 && pl.Dice2.getLastValue() == 3) {
            return 2;
        }
        else if (pl.Dice1.getLastValue() + pl.Dice2.getLastValue() == 7) {
            return 2;
        }
        else if (pl.Dice1.getLastValue() == 4 && pl.Dice2.getLastValue() == 4) {
            return 1;
        }
        else if (pl.Dice1.getLastValue() == 2 && pl.Dice2.getLastValue() == 2) {
            return 1;
        }
        else if (pl.Dice1.getLastValue() == 1 && pl.Dice2.getLastValue() == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
