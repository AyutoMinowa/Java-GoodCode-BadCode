package chapter06_separationofconcernsbasic.weaponbreak.good;

class SpecialGauge {
  private static final int MIN = 0;
  private static final int MAX = 100;
  private static final int BASIC_INCREASE_AMOUNT = 5;
  final int amount;

  SpecialGauge(final int amount) {
    if (amount < MIN || MAX < amount) {
      throw new IllegalArgumentException("スペシャルゲージは0～100である必要があります。");
    }

    this.amount = amount;
  }

  SpecialGauge increase(final Damage damage) {
    final int increaseAmount = BASIC_INCREASE_AMOUNT + damage.amount / 100;
    final int newAmount = Math.min(amount + increaseAmount, MAX);

    return new SpecialGauge(newAmount);
  }

  boolean isFull() {
    return amount == MAX;
  }
}
