package chapter05_encapsulationpractices.primitiveobsession.v2;

class RegularPrice {
  final int amount;

  /**
   * @param amount 金額
   */
  //「定価」という具体的な型として設計する
  RegularPrice(final int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
    this.amount = amount;
  }
}
