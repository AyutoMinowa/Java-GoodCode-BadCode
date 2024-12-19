package chapter08_conditionbranch.earlyreturn.v4;

import chapter08_conditionbranch.earlyreturn.Magic;
import chapter08_conditionbranch.earlyreturn.Member;

public class NestedLogic {
  Member member;
  Magic magic;

  void method() {
    if (member.hitPoint <= 0) return;
    if (!member.canAct()) return;
    if (member.magicPoint < magic.costMagicPoint) return;
    if (member.technicalPoint < magic.costTechnicalPoint) return;  // 新規追加

    member.consumeMagicPoint(magic.costMagicPoint);
    member.chant(magic);
  }
}
