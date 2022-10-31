public class Die6
{
  private int value;
  public Die6(int diceNumber) {
    this.roll(diceNumber);
  }
  public int getValue() {
    return value;
  }
  public void roll(int diceNumber) {
      int[] dice;
      for (int i = 0; i < diceNumber; i++) {
          if (i < diceNumber) {
              dice[i] = (int)(Math.random() * 6) + 1;
              return 
          }
      }
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }
}
