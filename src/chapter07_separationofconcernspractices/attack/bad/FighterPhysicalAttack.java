package chapter07_separationofconcernspractices.attack.bad;

class FighterPhysicalAttack extends PhysicalAttack {
  @Override
  int singleAttackDamage() {
    return super.singleAttackDamage() + 20;
  }

  @Override
  int doubleAttackDamage() {
    return super.doubleAttackDamage() + 10;
  }
}
