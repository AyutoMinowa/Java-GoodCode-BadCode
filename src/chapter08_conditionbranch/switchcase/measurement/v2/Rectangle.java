package chapter08_conditionbranch.switchcase.measurement.v2;

class Rectangle implements Measurement {
  private final double width;
  private final double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return width * height;
  }
}
