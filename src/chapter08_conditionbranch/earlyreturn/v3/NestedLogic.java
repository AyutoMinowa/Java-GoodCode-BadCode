package chapter08_conditionbranch.earlyreturn.v3;

import chapter08_conditionbranch.earlyreturn.Magic;
import chapter08_conditionbranch.earlyreturn.Member;

public class NestedLogic {
  Member member;
  Magic magic;

  void method() {
    if (member.hitPoint <= 0) return;
    if (!member.canAct()) return;
    if (member.magicPoint < magic.costMagicPoint) return;

    member.consumeMagicPoint(magic.costMagicPoint);
    member.chant(magic);
  }
}
