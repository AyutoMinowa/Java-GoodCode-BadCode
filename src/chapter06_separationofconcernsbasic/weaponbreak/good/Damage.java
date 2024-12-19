package chapter06_separationofconcernsbasic.weaponbreak.good;

import chapter06_separationofconcernsbasic.weaponbreak.Enemy;
import chapter06_separationofconcernsbasic.weaponbreak.Member;

class Damage {
  final int amount;

  Damage(final Member member, final Weapon weapon, final SpecialGauge specialGauge, final Enemy enemy) {
    final int basicAmount = Math.max(0, (member.armPower + weapon.power) - enemy.defence / 2);
    amount = specialGauge.isFull() ? basicAmount * 2 : basicAmount;
  }
}
