package chapter07_separationofconcernspractices.commonextend.v2;

class SummerDiscount extends DiscountBase {
  @Override
  int getDiscountedPrice() {
    return (int)(price * (1.00 - 0.05));
  }
}
