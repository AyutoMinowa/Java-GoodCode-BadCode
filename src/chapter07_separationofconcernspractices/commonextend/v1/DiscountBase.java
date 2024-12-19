package chapter07_separationofconcernspractices.commonextend.v1;

// 割引のスーパークラス
abstract class DiscountBase {
  protected int price;    // 元値

  // 割引価格を返す
  int getDiscountedPrice() {
    int discountedPrice = price - 300;
    if (discountedPrice < 0) {
      discountedPrice = 0;
    }
    return discountedPrice;
  }
}
