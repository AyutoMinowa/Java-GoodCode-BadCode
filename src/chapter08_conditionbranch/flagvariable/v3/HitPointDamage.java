package chapter08_conditionbranch.flagvariable.v3;

import chapter08_conditionbranch.flagvariable.Member;
import chapter08_conditionbranch.flagvariable.StateType;

class HitPointDamage implements Damage {
  Member member;
  // 中略
  public void execute(final int damageAmount) {
    member.hitPoint -= damageAmount;
    if (0 < member.hitPoint) return;

    member.hitPoint = 0;
    member.addState(StateType.dead);
  }
}
