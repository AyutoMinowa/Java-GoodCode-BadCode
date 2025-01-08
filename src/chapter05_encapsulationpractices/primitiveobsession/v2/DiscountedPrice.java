package chapter05_encapsulationpractices.primitiveobsession.v2;

class DiscountedPrice {
  final int amount;

  /**
   * @param regularPrice 定価
   * @param discountRate 割引率
   */
  //プリミティブではなく、クラスの型を渡す
  //各クラスそれぞれに関連の高いデータとロジック同士がカプセル化される。
  DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
    // regularPriceとdiscountRateを使った計算
    amount = 0;
  }
}
