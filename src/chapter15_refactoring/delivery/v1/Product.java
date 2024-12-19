package chapter15_refactoring.delivery.v1;

class Product {
  final int id;
  final String name;
  final int price;

  Product(final int id, final String name, final int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }
}