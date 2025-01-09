package chapter08_conditionbranch.switchcase.measurement.v1;

//円
class Circle {
  private final double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double area() {
    return radius * radius * Math.PI;
  }
}
