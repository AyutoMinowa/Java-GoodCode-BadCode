package chapter08_conditionbranch.policy.v2;

import chapter08_conditionbranch.policy.PurchaseHistory;

interface ExcellentCustomerRule {
  /**
   * @return 条件を満たす場合true
   * @param history 購入履歴
   */
  boolean ok(final PurchaseHistory history);
}
