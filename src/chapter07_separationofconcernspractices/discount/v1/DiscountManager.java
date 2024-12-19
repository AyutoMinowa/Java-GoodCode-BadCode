package chapter07_separationofconcernspractices.discount.v1;

import java.util.List;

class DiscountManager {
  List<Product> discountProducts;
  int totalPrice;

  /**
   * 割引価格を取得する
   *
   * @param price 商品価格
   * @return 割引価格
   */
  static int getDiscountPrice(int price) {
    int discountPrice = price - 300;
    if (discountPrice < 0) {
      discountPrice = 0;
    }
    return discountPrice;
  }
}
