package chapter06_separationofconcernsbasic.weaponbreak.good;

class Weapon {
  private static final int MIN_POWER = 1;
  private static final int BREAK_THRESHOLD = 10;
  private static final int MIN_DURABILITY = 0;
  final String name;
  final int power;
  final int durability;

  Weapon(final String name, final int power, final int durability) {
    if (power < MIN_POWER) {
      throw new IllegalArgumentException("武器の攻撃力は1以上である必要があります。");
    }
    if (durability < MIN_DURABILITY) {
      throw new IllegalArgumentException("武器の耐久力は0以上である必要があります。");
    }

    this.name = name;
    this.power = power;
    this.durability = durability;
  }

  boolean canUse() {
    return MIN_DURABILITY < durability;
  }

  Weapon use(final Damage damage, final SpecialGauge specialGauge) {
    if (!canUse()) {
      throw new RuntimeException();
    }
    if(!specialGauge.isFull() && damage.amount < BREAK_THRESHOLD) {
      return new Weapon(name, power, durability - 1);
    }

    return this;
  }
}
