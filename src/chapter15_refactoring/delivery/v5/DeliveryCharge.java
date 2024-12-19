package chapter15_refactoring.delivery.v5;

class DeliveryCharge {
  final int amount;

  DeliveryCharge(final ShoppingCart shoppingCart) {
    amount = DeliveryManager.deliveryCharge(shoppingCart);
  }
}
