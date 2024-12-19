package chapter08_conditionbranch.switchcase.measurement.v1;

public class ShowAreaLogic {
  void showArea(Object shape) {
    if (shape instanceof Rectangle) {
      System.out.println(((Rectangle) shape).area());
    }
    if (shape instanceof Circle) {
      System.out.println(((Circle) shape).area());
    }
  }
}
