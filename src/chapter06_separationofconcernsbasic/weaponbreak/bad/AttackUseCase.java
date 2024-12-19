package chapter06_separationofconcernsbasic.weaponbreak.bad;

import chapter06_separationofconcernsbasic.weaponbreak.Enemy;
import chapter06_separationofconcernsbasic.weaponbreak.Member;

import java.util.Random;

public class AttackUseCase {
  public int damageResult;

  public void execute(Member member, Weapon weapon, SpecialGauge specialGauge, Enemy enemy) {
    int damage = 0;
    if (0 < weapon.durability) {
      damage = (member.armPower + weapon.power) - enemy.defence / 2;
      if (damage > 0) {
        if (specialGauge.amount == 100) {
          damage *= 2;
        }
      }
      else {
        damage = 0;
      }
      if (specialGauge.amount < 100) {
        if (damage < 10) {
          weapon.durability -= 1;
        }
      }
      specialGauge.amount += 5 + damage / 100;
      if (specialGauge.amount > 100) {
        specialGauge.amount = 100;
      }
    }
    else {
      throw new RuntimeException("この武器では攻撃できません");
    }

    damageResult = damage;
  }
}
