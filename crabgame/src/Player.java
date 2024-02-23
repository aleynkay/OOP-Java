public class Player {
    Dice Dice1 = new Dice();
    Dice Dice2 = new Dice();
    public int score = 0;
    public int GoalDiceTotal;
    public void RollDices() {
        Dice1.Roll();
        Dice2.Roll();
        GoalDiceTotal = Dice1.getLastValue() + Dice2.getLastValue();
        System.out.println(Dice1.getLastValue() + " " + Dice2.getLastValue());
    }
}
