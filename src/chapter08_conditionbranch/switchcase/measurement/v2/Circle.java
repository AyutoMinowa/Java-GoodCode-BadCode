package chapter08_conditionbranch.switchcase.measurement.v2;

class Circle implements Measurement {
  private final double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return radius * radius * Math.PI;
  }
}
