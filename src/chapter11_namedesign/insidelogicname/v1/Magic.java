package chapter11_namedesign.insidelogicname.v1;

import chapter11_namedesign.insidelogicname.Member;

class Magic {
  int costMagicPoint;
  boolean isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(Member member) {
    if (0 < member.hitPoint) {
      if (member.canAct()) {
        if (costMagicPoint <= member.magicPoint) {
          return true;
        }
      }
    }

    return false;
  }
}