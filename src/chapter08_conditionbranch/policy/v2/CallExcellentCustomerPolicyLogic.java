package chapter08_conditionbranch.policy.v2;

import chapter08_conditionbranch.policy.PurchaseHistory;

public class CallExcellentCustomerPolicyLogic {
  PurchaseHistory purchaseHistory;
  void method() {
    ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
    goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule());
    goldCustomerPolicy.add(new PurchaseFrequencyRule());
    goldCustomerPolicy.add(new ReturnRateRule());

    goldCustomerPolicy.complyWithAll(purchaseHistory);
  }
}
