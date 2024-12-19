package chapter08_conditionbranch.policy.v2;

import chapter08_conditionbranch.policy.PurchaseHistory;

class PurchaseFrequencyRule implements ExcellentCustomerRule {
  public boolean ok(final PurchaseHistory history) {
    return 10 <= history.purchaseFrequencyPerMonth;
  }
}
