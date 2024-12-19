package chapter08_conditionbranch.hotelrate;

public class Money {
  public Money(int amount) {}

  public Money add(int other) {
    return new Money(other);
  }
}
