package chapter11_namedesign.insidelogicname.v2;

import chapter11_namedesign.insidelogicname.Member;

class Magic {
  int costMagicPoint;
  boolean canChant(final Member member) {
    if (member.hitPoint <= 0) return false;
    if (!member.canAct()) return false;
    if (member.magicPoint < costMagicPoint) return false;

    return true;
  }
}
