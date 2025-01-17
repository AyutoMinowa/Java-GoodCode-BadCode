package chapter06_separationofconcernsbasic.selling.good;

class SellingCommission {
  private static final float SELLING_COMMISSION_RATE = 0.05f;
  final int amount;

  SellingCommission(final SellingPrice sellingPrice) {
    amount = (int)(sellingPrice.amount * SELLING_COMMISSION_RATE);
  }
}
