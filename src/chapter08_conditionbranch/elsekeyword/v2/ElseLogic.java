package chapter08_conditionbranch.elsekeyword.v2;

import chapter08_conditionbranch.elsekeyword.HealthCondition;
import chapter08_conditionbranch.elsekeyword.Member;

public class ElseLogic {
  Member member;
  HealthCondition method() {
    float hitPointRate = member.hitPoint / member.maxHitPoint;

    if (hitPointRate == 0) {
      return HealthCondition.dead;
    }
    else if (hitPointRate < 0.3) {
      return HealthCondition.danger;
    }
    else if (hitPointRate < 0.5) {
      return HealthCondition.caution;
    }
    else {
      return HealthCondition.fine;
    }
  }
}
