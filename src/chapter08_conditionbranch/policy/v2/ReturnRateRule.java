package chapter08_conditionbranch.policy.v2;

import chapter08_conditionbranch.policy.PurchaseHistory;

class ReturnRateRule implements ExcellentCustomerRule {
  public boolean ok(final PurchaseHistory history) {
    return history.returnRate <= 0.001;
  }
}
