package chapter06_separationofconcernsbasic.weaponbreak.good;

import chapter06_separationofconcernsbasic.weaponbreak.Enemy;
import chapter06_separationofconcernsbasic.weaponbreak.Member;

class AttackUseCase {
  void execute(Member member, Weapon weapon, SpecialGauge specialGauge, Enemy enemy) {
    if (!weapon.canUse()) {
      throw new RuntimeException("この武器では攻撃できません");
    }
    final Damage damage = new Damage(member, weapon, specialGauge, enemy);
    final Weapon usedWeapon = weapon.use(damage, specialGauge);
    final SpecialGauge increasedSpecialGauge = specialGauge.increase(damage);
  }
}
