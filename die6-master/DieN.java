
public class DieN
{
  /**
   * Contains the current value of the die
   */
  private int value;
  private int sides;
  /**
   * Constructor to do an initial roll to set the first value
   */
  public DieN(int sides) {
    this.roll();
    this.sides = sides;
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return value;
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    this.value = (int)(Math.random() * sides) + 1;
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}
