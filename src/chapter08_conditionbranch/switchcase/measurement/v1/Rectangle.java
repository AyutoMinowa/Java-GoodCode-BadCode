package chapter08_conditionbranch.switchcase.measurement.v1;

class Rectangle {
  private final double width;
  private final double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  double area() {
    return width * height;
  }
}
