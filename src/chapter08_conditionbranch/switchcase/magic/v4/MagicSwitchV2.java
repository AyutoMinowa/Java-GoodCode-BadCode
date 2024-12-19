package chapter08_conditionbranch.switchcase.magic.v4;

import chapter08_conditionbranch.switchcase.magic.MagicType;
import chapter08_conditionbranch.switchcase.magic.Member;

import java.util.Map;

public class MagicSwitchV2 {
  final private Member member = new Member();
  final Map<MagicType, MagicAttack> magicAttacks = Map.of(
    MagicType.fire, new Fire(member),
    MagicType.shiden, new Shiden(member),
    MagicType.hellFire, new HellFire(member)
  );
  // 中略

  // 魔法攻撃を実行する
  void magicAttack(final MagicType magicType) {
    final MagicAttack usingMagicAttack = magicAttacks.get(magicType);

    showMagicName(usingMagicAttack);
    consumeMagicPoint(usingMagicAttack);
    consumeTechnicalPoint(usingMagicAttack);
    magicDamage(usingMagicAttack);
  }

  // 魔法の名前を画面表示する
  void showMagicName(final MagicAttack magicAttack) {
    final String name = magicAttack.name();
    // nameを使った表示処理
  }

  // 魔法力を消費する
  void consumeMagicPoint(final MagicAttack magicAttack) {
    final int costMagicPoint = magicAttack.costMagicPoint();
    // costMagicPointを使った魔法力消費処理
  }

  // テクニカルポイントを消費する
  void consumeTechnicalPoint(final MagicAttack magicAttack) {
    final int costTechnicalPoint = magicAttack.costTechnicalPoint();
    // costTechnicalPointを使ったテクニカルポイント消費処理
  }

  // ダメージ計算する
  void magicDamage(final MagicAttack magicAttack) {
    final int attackPower = magicAttack.attackPower();
    // attackPowerを使ったダメージ計算
  }
}
