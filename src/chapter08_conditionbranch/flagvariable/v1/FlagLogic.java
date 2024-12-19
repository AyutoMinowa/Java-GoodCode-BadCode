package chapter08_conditionbranch.flagvariable.v1;

import chapter08_conditionbranch.flagvariable.Member;
import chapter08_conditionbranch.flagvariable.StateType;

public class FlagLogic {
  Member member;
  void damage(boolean damageFlag, int damageAmount) {
    if (damageFlag == true) {
      // ヒットポイントダメージ
      member.hitPoint -= damageAmount;
      if (0 < member.hitPoint) return;

      member.hitPoint = 0;
      member.addState(StateType.dead);
    }
    else {
      // 魔法力ダメージ
      member.magicPoint -= damageAmount;
      if (0 < member.magicPoint) return;

      member.magicPoint = 0;
    }
  }
}
