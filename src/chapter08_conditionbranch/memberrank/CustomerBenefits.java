package chapter08_conditionbranch.memberrank;

import java.util.Map;

class CustomerBenefits {
  private final Map<CustomerRank, CustomerBenefit> benefits;

  CustomerBenefits() {
    benefits = Map.of(
      CustomerRank.normal, new NormalCustomerBenefit(),
      CustomerRank.silver, new SilverCustomerBenefit(),
      CustomerRank.gold, new GoldCustomerBenefit()
    );
  }

  CustomerBenefit select(final CustomerRank customerRank) {
    return benefits.get(customerRank);
  }
}
