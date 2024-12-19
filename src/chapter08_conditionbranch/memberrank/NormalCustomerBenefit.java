package chapter08_conditionbranch.memberrank;

class NormalCustomerBenefit implements CustomerBenefit {
  public ShoppingPoint yearlyPointBonus(final PurchaseHistory history) {
    return new ShoppingPoint(0);
  }
}
