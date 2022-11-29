
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class diceClass
{
  /**
   * Contains the current value of the die
   */
  private Die6 die1;
  private Die6 die2;
  private int value;

  /**
   * Constructor to do an initial roll to set the first value
   */
  public diceClass() {
    die1=new Die6();
    die2=new Die6();
    this.roll();
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return die1.getValue()+die2.getValue();
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    die1.roll();
    die2.roll();
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

