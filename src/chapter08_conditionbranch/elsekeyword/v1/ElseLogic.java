package chapter08_conditionbranch.elsekeyword.v1;

import chapter08_conditionbranch.elsekeyword.HealthCondition;
import chapter08_conditionbranch.elsekeyword.Member;

public class ElseLogic {
  Member member;
  HealthCondition method() {
    float hitPointRate = member.hitPoint / member.maxHitPoint;

    HealthCondition currentHealthCondition;
    if (hitPointRate == 0) {
      currentHealthCondition = HealthCondition.dead;
    }
    else if (hitPointRate < 0.3) {
      currentHealthCondition = HealthCondition.danger;
    }
    else if (hitPointRate < 0.5) {
      currentHealthCondition = HealthCondition.caution;
    }
    else {
      currentHealthCondition = HealthCondition.fine;
    }

    return currentHealthCondition;
  }
}
