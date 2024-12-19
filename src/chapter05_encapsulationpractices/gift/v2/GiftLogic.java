package chapter05_encapsulationpractices.gift.v2;

public class GiftLogic {
  void method1() {
    GiftPoint standardMemberShipPoint = GiftPoint.forStandardMembership();
  }

  void method2() {
    GiftPoint premiumMemberShipPoint = GiftPoint.forPremiumMembership();
  }
}
