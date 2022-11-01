public class Die6
{
  private int value;
  public Die6(int diceNumber) {
    this.roll(diceNumber);
  }
  public int[] getValue() {
    return value;
  }
  public void roll(int diceNumber) {
    int[] dieValue = new int[diceNumber];
    for (int i = 0; i < diceNumber; i++) {
        value[i] = (int)(Math.random() * 6) + 1;
    }
  }
  public int[] rollAndGetValue() {
    roll(diceNumber);
    return getValue();
  }
}
