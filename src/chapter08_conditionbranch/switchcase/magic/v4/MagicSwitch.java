package chapter08_conditionbranch.switchcase.magic.v4;

import chapter08_conditionbranch.switchcase.magic.MagicType;
import chapter08_conditionbranch.switchcase.magic.Member;

import java.util.Map;

public class MagicSwitch {
  final private Member member = new Member();
  final Map<MagicType, MagicAttack> magicAttacks = Map.of(
    MagicType.fire, new Fire(member),
    MagicType.shiden, new Shiden(member),
    MagicType.hellFire, new HellFire(member)
  );

  void magicAttack(final MagicType magicType) {
    final MagicAttack usingMagicAttack = magicAttacks.get(magicType);
    usingMagicAttack.attackPower();
    // 省略
  }
}
