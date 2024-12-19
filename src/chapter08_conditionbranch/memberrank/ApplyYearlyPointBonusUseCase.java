package chapter08_conditionbranch.memberrank;

class ApplyYearlyPointBonusUseCase {
  private final CustomerBenefits customerBenefits;

  ApplyYearlyPointBonusUseCase() {
    customerBenefits = new CustomerBenefits();
  }

  void call(CustomerRank customerRank, PurchaseHistory purchaseHistory) {
    final CustomerBenefit customerBenefit = customerBenefits.select(customerRank);
    final ShoppingPoint yearPointBonus = customerBenefit.yearlyPointBonus(purchaseHistory);
  }
}
