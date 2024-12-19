package chapter07_separationofconcernspractices.commonextend.v2;

class RegularDiscount extends DiscountBase {
  @Override
  protected int discountCharge() {
    return 400;
  }
}
