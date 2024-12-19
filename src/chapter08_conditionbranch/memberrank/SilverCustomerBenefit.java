package chapter08_conditionbranch.memberrank;

class SilverCustomerBenefit implements CustomerBenefit {
  private static final int POINT_BONUS_APPLICABLE_AMOUNT = 100000;
  private static final double POINT_BACK_RATE = 0.01;

  public ShoppingPoint yearlyPointBonus(final PurchaseHistory history) {
    if (POINT_BONUS_APPLICABLE_AMOUNT <= history.yearlyAmount()) {
      final int pointBonus = (int) (history.yearlyAmount() * POINT_BACK_RATE);
      return new ShoppingPoint(pointBonus);
    }

    return new ShoppingPoint(0);
  }
}
