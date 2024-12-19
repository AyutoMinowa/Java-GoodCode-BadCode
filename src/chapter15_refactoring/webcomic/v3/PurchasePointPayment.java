package chapter15_refactoring.webcomic.v3;

import chapter15_refactoring.webcomic.*;

import java.time.LocalDateTime;

class PurchasePointPayment {
  final CustomerId customerId;
  final ComicId comicId;
  final PurchasePoint consumptionPoint;
  final LocalDateTime paymentDateTime;

  PurchasePointPayment(final Customer customer, final Comic comic) {
    if (!customer.isEnabled()) {
      throw new IllegalArgumentException("有効な購入者ではありません。");
    }
    customerId = customer.id;
    if (!comic.isEnabled()) {
      throw new IllegalArgumentException("現在取り扱いのできないコミックです。");
    }
    comicId = comic.id;
    if (customer.possessionPoint.amount < comic.currentPurchasePoint.amount) {
      throw new RuntimeException("所持ポイントが不足しています。");
    }
    consumptionPoint = comic.currentPurchasePoint;
    paymentDateTime = LocalDateTime.now();
  }
}
