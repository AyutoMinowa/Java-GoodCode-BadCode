package chapter08_conditionbranch.memberrank;

class PurchaseHistory {
  private final int myYearlyAmount;

  PurchaseHistory(int yearlyAmount) {
    myYearlyAmount = yearlyAmount;
  }

  int yearlyAmount() {
    return myYearlyAmount;
  }
}
