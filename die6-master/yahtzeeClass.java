
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class yahtzeeClass
{
  /**
   * Contains the current value of the die
   */
  private Die6 die1;
  private Die6 die2;
  private Die6 die3;
  private Die6 die4;
  private Die6 die5;
  private int dieNumber;
  /**
   * Constructor to do an initial roll to set the first value
   */
  public yahtzeeClass() {
    die1=new Die6();
    die2=new Die6();
    die3=new Die6();
    die4=new Die6();
    die5=new Die6();
    this.roll();
    this.dieNumber=dieNumber;
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return die1.getValue()+die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    die1.roll();
    die2.roll();
    die3.roll();
    die4.roll();
    die5.roll();
  }
  public void roll(int dieNumber) {
    this.dieNumber=dieNumber;
    if (dieNumber==1) {
        die1.roll();
    }
    if (dieNumber==2) {
        die2.roll();
    }
    if (dieNumber==3) {
        die3.roll();
    }
    if (dieNumber==4) {
        die4.roll();
    }
    if (dieNumber==5) {
        die5.roll();
    }
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

