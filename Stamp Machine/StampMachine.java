public class StampMachine
{
  public StampMachine()
  {
    money = 0;
  }

  public void insert (double amount)
  {
    money += amount;
  }

  public int giveFirstClassStamps()
  {
    int firstClassStamps =
    (int)(money / FIRST_CLASS_STAMP_PRICE);
    money = money - firstClassStamps * FIRST_CLASS_STAMP_PRICE;
    return firstClassStamps;
  }
public int givePennyStamps()
{
  int pennyStamps = (int)Math.round(100*money);
  money=0;
  return pennyStamps;

}
private double money;
private static final double FIRST_CLASS_STAMP_PRICE = .34;

}
