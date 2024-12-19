package chapter08_conditionbranch.memberrank;

class GoldCustomerBenefit implements CustomerBenefit {
  private static final int FIXED_POINT_BONUS = 1000;
  private static final double POINT_BACK_RATE = 0.02;

  public ShoppingPoint yearlyPointBonus(final PurchaseHistory history) {
    final int pointBonus = FIXED_POINT_BONUS + (int) (history.yearlyAmount() * POINT_BACK_RATE);
    return new ShoppingPoint(pointBonus);
  }
}
