package chapter08_conditionbranch.policy.v2;

import chapter08_conditionbranch.policy.PurchaseHistory;

class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {
  public boolean ok(final PurchaseHistory history) {
    return 100000 <= history.totalAmount;
  }
}
