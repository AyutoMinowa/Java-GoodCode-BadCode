package chapter15_refactoring.delivery.v5;

/**
 * 配送管理クラス
 */
public class DeliveryManager {
  public static int deliveryCharge(ShoppingCart shoppingCart) {
    int charge = 0;
    if (shoppingCart.totalPrice() < 2000) {
      charge = 500;
    }
    else {
      charge = 0;
    }
    return charge;
  }
}
