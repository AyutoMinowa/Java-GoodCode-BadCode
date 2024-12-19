package chapter02_designfirststep.hitpoint.v2;

class HitPoint {
  private static final int MIN = 0;
  private static final int MAX = 999;
  private static final int MIN_DAMAGE_AMOUNT = 0;
  private static final int MIN_RECOVERY_AMOUNT = 0;
  final int value;

  HitPoint(final int value) {
    if (value < MIN) {
      throw new IllegalArgumentException("ヒットポイントは" + MIN + "以上を指定してください");
    }
    if (MAX < value) {
      throw new IllegalArgumentException("ヒットポイントは" + MAX + "以下を指定してください");
    }

    this.value = value;
  }

  // HPダメージを受ける
  HitPoint damage(final int damageAmount) {
    if (damageAmount < MIN_DAMAGE_AMOUNT) {
      throw new IllegalArgumentException("ダメージ量は" + MIN_DAMAGE_AMOUNT + "以上を指定してください");
    }

    final int damaged = value - damageAmount;
    final int corrected = damaged < MIN ? MIN : damaged;
    return new HitPoint(corrected);
  }

  // HPを回復する
  HitPoint recover(final int recoveryAmount) {
    if (recoveryAmount < MIN_RECOVERY_AMOUNT) {
      throw new IllegalArgumentException("回復量は" + MIN_RECOVERY_AMOUNT + "以上を指定してください");
    }

    final int recovered = value + recoveryAmount;
    final int corrected = MAX < recovered ? MAX : recovered;
    return new HitPoint(corrected);
  }
}
