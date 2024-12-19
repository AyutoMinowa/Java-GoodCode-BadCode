package chapter08_conditionbranch.switchcase.magic.v4;

import chapter08_conditionbranch.switchcase.magic.Member;

// 魔法「ファイア」
class Fire implements MagicAttack {
  private final Member member;

  Fire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "ファイア";
  }

  public int costMagicPoint() {
    return 2;
  }

  public int attackPower() {
    return 20 + (int)(member.level * 0.5);
  }

  public int costTechnicalPoint() {
    return 0;
  }
}
