public class Dice
{
  private int value;
  private int[] dice;
  private int diceNumber;
  public Dice(int diceNumber) {
      this.diceNumber = diceNumber;
      this.dice = new int[diceNumber];
      this.roll();
  }
  public int[] getValue() {
      return dice;
  }
  public void roll() {
      int i = 0;
        while (i < this.diceNumber) {
        this.value = (int)(Math.random() * 6) + 1;
        this.dice[i] = value;
        i++;
      }
  }
  public int[] rollAndGetValue() {
      this.roll();
      return getValue();
  }
}
